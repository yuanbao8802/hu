
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AgentCert complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AgentCert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qualificationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qualificationPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qualificationOldFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qualificationRecvDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appImageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appImageFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appImageFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCert", propOrder = {
    "qualificationType",
    "qualificationNo",
    "qualificationPath",
    "qualificationOldFilename",
    "qualificationRecvDate",
    "appImageType",
    "appImageFileName",
    "appImageFilePath"
})
public class AgentCert {

    protected String qualificationType;
    protected String qualificationNo;
    protected String qualificationPath;
    protected String qualificationOldFilename;
    protected String qualificationRecvDate;
    protected String appImageType;
    protected String appImageFileName;
    protected String appImageFilePath;

    /**
     * ��ȡqualificationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationType() {
        return qualificationType;
    }

    /**
     * ����qualificationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationType(String value) {
        this.qualificationType = value;
    }

    /**
     * ��ȡqualificationNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationNo() {
        return qualificationNo;
    }

    /**
     * ����qualificationNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationNo(String value) {
        this.qualificationNo = value;
    }

    /**
     * ��ȡqualificationPath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationPath() {
        return qualificationPath;
    }

    /**
     * ����qualificationPath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationPath(String value) {
        this.qualificationPath = value;
    }

    /**
     * ��ȡqualificationOldFilename���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationOldFilename() {
        return qualificationOldFilename;
    }

    /**
     * ����qualificationOldFilename���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationOldFilename(String value) {
        this.qualificationOldFilename = value;
    }

    /**
     * ��ȡqualificationRecvDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationRecvDate() {
        return qualificationRecvDate;
    }

    /**
     * ����qualificationRecvDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationRecvDate(String value) {
        this.qualificationRecvDate = value;
    }

    /**
     * ��ȡappImageType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppImageType() {
        return appImageType;
    }

    /**
     * ����appImageType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppImageType(String value) {
        this.appImageType = value;
    }

    /**
     * ��ȡappImageFileName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppImageFileName() {
        return appImageFileName;
    }

    /**
     * ����appImageFileName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppImageFileName(String value) {
        this.appImageFileName = value;
    }

    /**
     * ��ȡappImageFilePath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppImageFilePath() {
        return appImageFilePath;
    }

    /**
     * ����appImageFilePath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppImageFilePath(String value) {
        this.appImageFilePath = value;
    }

}
