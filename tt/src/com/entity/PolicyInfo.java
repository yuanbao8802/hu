package com.entity;

import java.util.Date;
import java.util.List;

public class PolicyInfo {

	private Applicant applicant ; // Ͷ������Ϣ
	private List<Insurance> insurances; // ��������Ϣ
	private Product product; // ��Ʒ��Ϣ
	private Provider provider; // ��Ӧ����Ϣ
	
	private String userid; // �û�id
	private Date createDate; // ��������
	private Date effectiveDate ; // ������
	private Date expiryDate ; // ������������
	private int qua ; // �����˸���
	private double price; // �۸�
}
