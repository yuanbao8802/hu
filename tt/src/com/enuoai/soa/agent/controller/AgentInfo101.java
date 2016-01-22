
package com.enuoai.soa.agent.controller;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AgentInfo101 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AgentInfo101">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userNames" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="politicalStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recommendMobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recommendAgentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentCheckRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contacteMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="districtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAccountAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankBranchName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentCertSet" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="agentCert" type="{http://controller.agent.soa.enuoai.com/}AgentCert" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentInfo101", propOrder = {
    "userId",
    "userNames",
    "password",
    "agentId",
    "agentName",
    "agentCode",
    "politicalStatus",
    "recommendMobileNo",
    "recommendAgentCode",
    "agentStatus",
    "agentCheckRemark",
    "cardId",
    "mobileNo",
    "contacteMail",
    "districtCode",
    "cityCode",
    "bankAccountAddr",
    "bankNo",
    "bankAccountNo",
    "bankBranchName",
    "companyName",
    "contactPhone",
    "agentCertSet"
})
public class AgentInfo101 {

    protected String userId;
    protected AgentInfo101 .UserNames userNames;
    protected String password;
    protected String agentId;
    @XmlElement(required = true)
    protected String agentName;
    protected String agentCode;
    @XmlElement(required = true)
    protected String politicalStatus;
    protected String recommendMobileNo;
    protected String recommendAgentCode;
    protected String agentStatus;
    protected String agentCheckRemark;
    @XmlElement(required = true)
    protected String cardId;
    protected String mobileNo;
    protected String contacteMail;
    protected String districtCode;
    protected String cityCode;
    @XmlElement(required = true)
    protected String bankAccountAddr;
    @XmlElement(required = true)
    protected String bankNo;
    @XmlElement(required = true)
    protected String bankAccountNo;
    @XmlElement(required = true)
    protected String bankBranchName;
    protected String companyName;
    protected String contactPhone;
    protected AgentInfo101 .AgentCertSet agentCertSet;

    /**
     * ��ȡuserId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ����userId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * ��ȡuserNames���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AgentInfo101 .UserNames }
     *     
     */
    public AgentInfo101 .UserNames getUserNames() {
        return userNames;
    }

    /**
     * ����userNames���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AgentInfo101 .UserNames }
     *     
     */
    public void setUserNames(AgentInfo101 .UserNames value) {
        this.userNames = value;
    }

    /**
     * ��ȡpassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����password���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * ��ȡagentId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * ����agentId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * ��ȡagentName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * ����agentName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * ��ȡagentCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * ����agentCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * ��ȡpoliticalStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    /**
     * ����politicalStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticalStatus(String value) {
        this.politicalStatus = value;
    }

    /**
     * ��ȡrecommendMobileNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendMobileNo() {
        return recommendMobileNo;
    }

    /**
     * ����recommendMobileNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendMobileNo(String value) {
        this.recommendMobileNo = value;
    }

    /**
     * ��ȡrecommendAgentCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendAgentCode() {
        return recommendAgentCode;
    }

    /**
     * ����recommendAgentCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendAgentCode(String value) {
        this.recommendAgentCode = value;
    }

    /**
     * ��ȡagentStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    /**
     * ����agentStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentStatus(String value) {
        this.agentStatus = value;
    }

    /**
     * ��ȡagentCheckRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCheckRemark() {
        return agentCheckRemark;
    }

    /**
     * ����agentCheckRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCheckRemark(String value) {
        this.agentCheckRemark = value;
    }

    /**
     * ��ȡcardId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * ����cardId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * ��ȡmobileNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * ����mobileNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

    /**
     * ��ȡcontacteMail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacteMail() {
        return contacteMail;
    }

    /**
     * ����contacteMail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacteMail(String value) {
        this.contacteMail = value;
    }

    /**
     * ��ȡdistrictCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * ����districtCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictCode(String value) {
        this.districtCode = value;
    }

    /**
     * ��ȡcityCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * ����cityCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * ��ȡbankAccountAddr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountAddr() {
        return bankAccountAddr;
    }

    /**
     * ����bankAccountAddr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountAddr(String value) {
        this.bankAccountAddr = value;
    }

    /**
     * ��ȡbankNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * ����bankNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNo(String value) {
        this.bankNo = value;
    }

    /**
     * ��ȡbankAccountNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * ����bankAccountNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNo(String value) {
        this.bankAccountNo = value;
    }

    /**
     * ��ȡbankBranchName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranchName() {
        return bankBranchName;
    }

    /**
     * ����bankBranchName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranchName(String value) {
        this.bankBranchName = value;
    }

    /**
     * ��ȡcompanyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * ����companyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * ��ȡcontactPhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * ����contactPhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * ��ȡagentCertSet���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AgentInfo101 .AgentCertSet }
     *     
     */
    public AgentInfo101 .AgentCertSet getAgentCertSet() {
        return agentCertSet;
    }

    /**
     * ����agentCertSet���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AgentInfo101 .AgentCertSet }
     *     
     */
    public void setAgentCertSet(AgentInfo101 .AgentCertSet value) {
        this.agentCertSet = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="agentCert" type="{http://controller.agent.soa.enuoai.com/}AgentCert" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "agentCert"
    })
    public static class AgentCertSet {

        protected List<AgentCert> agentCert;

        /**
         * Gets the value of the agentCert property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agentCert property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgentCert().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AgentCert }
         * 
         * 
         */
        public List<AgentCert> getAgentCert() {
            if (agentCert == null) {
                agentCert = new ArrayList<AgentCert>();
            }
            return this.agentCert;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userName"
    })
    public static class UserNames {

        protected List<String> userName;

        /**
         * Gets the value of the userName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getUserName() {
            if (userName == null) {
                userName = new ArrayList<String>();
            }
            return this.userName;
        }

    }

}
