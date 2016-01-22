package com.entity;

import java.util.Date;
import java.util.List;

public class PolicyInfo {

	private Applicant applicant ; // 投保人信息
	private List<Insurance> insurances; // 被保人信息
	private Product product; // 产品信息
	private Provider provider; // 供应商信息
	
	private String userid; // 用户id
	private Date createDate; // 创建日期
	private Date effectiveDate ; // 起保日期
	private Date expiryDate ; // 保单到期日期
	private int qua ; // 被保人个数
	private double price; // 价格
}
