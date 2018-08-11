package com.cobee.javawebtech.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpRequestTester {

//	public static void main(String[] args) {
//		
//		CloseableHttpClient httpclient = HttpClients.createDefault();
//		HttpPost httpPost = new HttpPost("https://www.taobao.com/");
//		CloseableHttpResponse response = null;
//		try {
//			response = httpclient.execute(httpPost);
//			System.out.println(response.getStatusLine());
//		    HttpEntity entity = response.getEntity();
//		    EntityUtils.consume(entity);
//		    String encoding = "UTF-8";
//		    Header contentEncodingHeader = entity.getContentEncoding();
//		    if (contentEncodingHeader != null)
//		    {
//		    	System.out.println(contentEncodingHeader.getName());
//			    System.out.println(contentEncodingHeader.getValue());
//		    }
//		    
//		    Header contentTypeHeader = entity.getContentType();
//		    if (contentTypeHeader != null)
//		    {
//		    	System.out.println(contentTypeHeader.getName());
//		    	System.out.println(contentTypeHeader.getValue());
//		    	if (StringUtils.isNotBlank(contentTypeHeader.getValue()))
//		    	{
//		    		encoding = StringUtils.substringAfter(contentTypeHeader.getValue(), "charset=");
//		    	}
//		    }
//		    
//		    InputStream inputStream = entity.getContent();
//		    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, encoding);
//		    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//		    String line = null;
//		    while ((line = bufferedReader.readLine()) != null)
//		    {
//		    	System.out.println(line);
//		    }
//		    System.out.println(EntityUtils.toString(entity));
//		    EntityUtils.consume(entity);
//		} catch (ClientProtocolException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		finally
//		{
//			if (response != null)
//			{
//				try {
//					response.close();
//				} catch (IOException e) {
//				}
//			}
//			
//		}
//
//	}
	
	public static void main(String[] args) throws IOException
	{
		URL url = new URL("https://www.taobao.com/");
		System.out.println(url.getHost());
		InetAddress inetAddress = InetAddress.getByName(url.getHost());
		System.out.println(inetAddress.getHostAddress());
	}

}
