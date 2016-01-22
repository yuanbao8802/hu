
package com.enuoai.soa.agent.controller;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>commissionDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="commissionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commissionProductRateList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="commissionProductRate" type="{http://controller.agent.soa.enuoai.com/}commissionProductRate" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalRealPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalCommissionAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commissionDetail", propOrder = {
    "contractId",
    "contractNo",
    "effectiveDate",
    "matureDate",
    "commissionProductRateList",
    "totalRealPremium",
    "totalCommissionAmount"
})
public class CommissionDetail {

    protected String contractId;
    protected String contractNo;
    protected String effectiveDate;
    protected String matureDate;
    @XmlElement(required = true)
    protected CommissionDetail.CommissionProductRateList commissionProductRateList;
    protected Double totalRealPremium;
    protected Double totalCommissionAmount;

    /**
     * 获取contractId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * 设置contractId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * 获取contractNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * 设置contractNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * 获取matureDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatureDate() {
        return matureDate;
    }

    /**
     * 设置matureDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatureDate(String value) {
        this.matureDate = value;
    }

    /**
     * 获取commissionProductRateList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommissionDetail.CommissionProductRateList }
     *     
     */
    public CommissionDetail.CommissionProductRateList getCommissionProductRateList() {
        return commissionProductRateList;
    }

    /**
     * 设置commissionProductRateList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionDetail.CommissionProductRateList }
     *     
     */
    public void setCommissionProductRateList(CommissionDetail.CommissionProductRateList value) {
        this.commissionProductRateList = value;
    }

    /**
     * 获取totalRealPremium属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalRealPremium() {
        return totalRealPremium;
    }

    /**
     * 设置totalRealPremium属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalRealPremium(Double value) {
        this.totalRealPremium = value;
    }

    /**
     * 获取totalCommissionAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCommissionAmount() {
        return totalCommissionAmount;
    }

    /**
     * 设置totalCommissionAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCommissionAmount(Double value) {
        this.totalCommissionAmount = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="commissionProductRate" type="{http://controller.agent.soa.enuoai.com/}commissionProductRate" maxOccurs="unbounded" minOccurs="0"/>
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
        "commissionProductRate"
    })
    public static class CommissionProductRateList {

        protected List<CommissionProductRate> commissionProductRate;

        /**
         * Gets the value of the commissionProductRate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commissionProductRate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommissionProductRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommissionProductRate }
         * 
         * 
         */
        public List<CommissionProductRate> getCommissionProductRate() {
            if (commissionProductRate == null) {
                commissionProductRate = new ArrayList<CommissionProductRate>();
            }
            return this.commissionProductRate;
        }

    }

}
