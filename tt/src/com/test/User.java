package com.test;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="user")
public class User implements Serializable{

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void main(String[] args) throws Exception {
		User u = new User();
		u.setUsername("huyb");
		u.setPassword("123123");
		
		JAXBContext context = JAXBContext.newInstance(User.class);
		Marshaller marshaller = context.createMarshaller();
		// 设置编码字符集
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		// 格式化XML输出，有分行和缩进
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// 打印到控制台
//		marshaller.marshal(u, System.out);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		marshaller.marshal(u, baos);
		String xmlObj = new String(baos.toByteArray());
		System.out.println(xmlObj);
	}
}
