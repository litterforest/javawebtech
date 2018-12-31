package com.cobee.java8.alipay;

import java.io.UnsupportedEncodingException;
import java.security.*;
import java.util.Base64;

/**
 * Created by Administrator on 2018/12/31.
 */
public class MyRSATester {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException {
        // 1, 生成公钥和私钥
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        // 生成密钥对的长度是1024个字节。
        keyPairGenerator.initialize(1024);

        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();

        System.out.println("私钥值>>> " + Base64.getEncoder().encodeToString(privateKey.getEncoded()).length() + ": " + Base64.getEncoder().encodeToString(privateKey.getEncoded()));
        System.out.println("公钥值>>> " + Base64.getEncoder().encodeToString(publicKey.getEncoded()).length() + ": " + Base64.getEncoder().encodeToString(publicKey.getEncoded()));

        // 请求参数
        String param = "{\"username\": \"cobee\", \"password\": \"123456\"}";

        // 客户端使用私钥对请求参数进签名
        Signature signature = Signature.getInstance("SHA1withRSA");
        signature.initSign(privateKey);
        signature.update(param.getBytes("UTF-8"));
        byte[] signData = signature.sign();
        String signStr = Base64.getEncoder().encodeToString(signData);
        System.out.println("签名数据: " + signStr.length() + ": " + signStr);

        // 服务器端使用公钥验签
        signature.initVerify(publicKey);
        signature.update(param.getBytes("UTF-8"));
        boolean flag = signature.verify(Base64.getDecoder().decode(signStr.replace("/", "0")));
        System.out.println(flag);

    }

    /**
     * 公钥字符串转PublicKey对象
     * @return
     */
    private static PublicKey string2PublicKey(String publicKey)
    {

        return null;
    }

    /**
     * 公钥字符串转PublicKey对象
     * @return
     */
    private static PrivateKey string2PrivateKey(String privateKey)
    {

        return null;
    }

}
