package com.test;

import java.net.URI;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestVaildIdCard {

	private static final String VAILD_URL = "http://sales.allianz.com.cn/product/buy/as_enterinfo.aspx/CheckPH_ID_VALID";

	public static void main(String[] args) throws Exception {
		BasicCookieStore cookieStore = new BasicCookieStore();
		CloseableHttpClient client = HttpClients.custom()
				.setDefaultCookieStore(cookieStore).build();
		HttpUriRequest vaildUri = RequestBuilder.post().setUri(new URI(VAILD_URL))
				.addParameter("IDvalue", "441881198802125618").build();

		CloseableHttpResponse response = client.execute(vaildUri);
		HttpEntity entity = response.getEntity();
		System.out.println("Login form get: " + response.getStatusLine());
		EntityUtils.consume(entity);

		System.out.println("rs : " + EntityUtils.toString(entity));
		
		response.close();
		client.close();
	}
}
