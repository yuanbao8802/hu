
package com.enuoai.soa.agent.controller;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>account complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalCommissionAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rowCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="commissionDetailList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="commissionDetail" type="{http://controller.agent.soa.enuoai.com/}commissionDetail" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "account", propOrder = {
    "totalCommissionAmount",
    "totalPremium",
    "rowCount",
    "commissionDetailList"
})
public class Account {

    protected Double totalCommissionAmount;
    protected Double totalPremium;
    protected Long rowCount;
    @XmlElement(required = true)
    protected Account.CommissionDetailList commissionDetailList;

    /**
     * ��ȡtotalCommissionAmount���Ե�ֵ��
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
     * ����totalCommissionAmount���Ե�ֵ��
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
     * ��ȡtotalPremium���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPremium() {
        return totalPremium;
    }

    /**
     * ����totalPremium���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPremium(Double value) {
        this.totalPremium = value;
    }

    /**
     * ��ȡrowCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRowCount() {
        return rowCount;
    }

    /**
     * ����rowCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRowCount(Long value) {
        this.rowCount = value;
    }

    /**
     * ��ȡcommissionDetailList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Account.CommissionDetailList }
     *     
     */
    public Account.CommissionDetailList getCommissionDetailList() {
        return commissionDetailList;
    }

    /**
     * ����commissionDetailList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Account.CommissionDetailList }
     *     
     */
    public void setCommissionDetailList(Account.CommissionDetailList value) {
        this.commissionDetailList = value;
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
     *         &lt;element name="commissionDetail" type="{http://controller.agent.soa.enuoai.com/}commissionDetail" maxOccurs="unbounded" minOccurs="0"/>
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
        "commissionDetail"
    })
    public static class CommissionDetailList {

        protected List<CommissionDetail> commissionDetail;

        /**
         * Gets the value of the commissionDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commissionDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommissionDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommissionDetail }
         * 
         * 
         */
        public List<CommissionDetail> getCommissionDetail() {
            if (commissionDetail == null) {
                commissionDetail = new ArrayList<CommissionDetail>();
            }
            return this.commissionDetail;
        }

    }

}
