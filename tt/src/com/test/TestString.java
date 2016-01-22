package com.test;

import org.apache.commons.lang.StringUtils;

public class TestString {

	public static void main(String[] args) {
		Result r1 = new Result();
		String error = r1.getError();
		error = StringUtils.isBlank(error) ? "xxx" : error;
		Result r2 = new Result();
		r2.setError(error);
		System.out.println(r1.getError());
		System.out.println(r2.getError());
	}
}

class Result {
	String code;
	String error;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
}