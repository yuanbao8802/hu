
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AgentCert complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取qualificationType属性的值。
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
     * 设置qualificationType属性的值。
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
     * 获取qualificationNo属性的值。
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
     * 设置qualificationNo属性的值。
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
     * 获取qualificationPath属性的值。
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
     * 设置qualificationPath属性的值。
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
     * 获取qualificationOldFilename属性的值。
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
     * 设置qualificationOldFilename属性的值。
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
     * 获取qualificationRecvDate属性的值。
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
     * 设置qualificationRecvDate属性的值。
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
     * 获取appImageType属性的值。
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
     * 设置appImageType属性的值。
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
     * 获取appImageFileName属性的值。
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
     * 设置appImageFileName属性的值。
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
     * 获取appImageFilePath属性的值。
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
     * 设置appImageFilePath属性的值。
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
