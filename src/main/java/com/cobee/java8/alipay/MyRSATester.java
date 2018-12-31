package com.cobee.java8.alipay;

import com.alipay.api.internal.util.StreamUtil;

import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * Created by Administrator on 2018/12/31.
 */
public class MyRSATester {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException, InvalidKeySpecException {
        // 1, 生成公钥和私钥
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        // 生成密钥对的长度是1024个字节。
        keyPairGenerator.initialize(1024);

        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();
        String privateKeyStr = Base64.getEncoder().encodeToString(privateKey.getEncoded());
        String publicKeyStr = Base64.getEncoder().encodeToString(publicKey.getEncoded());
        System.out.println("私钥值>>> " + privateKeyStr.length() + ": " + privateKeyStr);
        System.out.println("公钥值>>> " + publicKeyStr.length() + ": " + publicKeyStr);

        // 请求参数
        String param = "{\"username\": \"cobee\", \"password\": \"123456\"}";

        // 客户端使用私钥对请求参数进签名
        Signature signature = Signature.getInstance("SHA1withRSA");
        privateKey = string2PrivateKey(privateKeyStr);
        signature.initSign(privateKey);
        signature.update(param.getBytes("UTF-8"));
        byte[] signData = signature.sign();
        String signStr = Base64.getEncoder().encodeToString(signData);
        System.out.println("签名数据: " + signStr.length() + ": " + signStr);

        // 服务器端使用公钥验签
        publicKey = string2PublicKey(publicKeyStr);
        signature.initVerify(publicKey);
        signature.update(param.getBytes("UTF-8"));
        boolean flag = signature.verify(Base64.getDecoder().decode(signStr));
        System.out.println(flag);

    }

    /**
     * 公钥字符串转PublicKey对象
     * @return
     */
    private static PublicKey string2PublicKey(String publicKey) throws NoSuchAlgorithmException, InvalidKeySpecException {

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        byte[] encodedKey = Base64.getDecoder().decode(publicKey);

        return keyFactory.generatePublic(new X509EncodedKeySpec(encodedKey));
    }

    /**
     * 公钥字符串转PublicKey对象
     * @return
     */
    private static PrivateKey string2PrivateKey(String privateKey) throws NoSuchAlgorithmException, InvalidKeySpecException {

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        byte[] encodedKey = Base64.getDecoder().decode(privateKey);

        return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(encodedKey));

    }

}
