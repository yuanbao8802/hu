
package com.enuoai.soa.agent.controller;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CommissionDetailData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CommissionDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionDetailList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="commissionDetail" type="{http://controller.agent.soa.enuoai.com/}monthCommissionDetail" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CommissionDetailData", propOrder = {
    "commissionDetailList"
})
public class CommissionDetailData {

    @XmlElement(required = true)
    protected CommissionDetailData.CommissionDetailList commissionDetailList;

    /**
     * 获取commissionDetailList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommissionDetailData.CommissionDetailList }
     *     
     */
    public CommissionDetailData.CommissionDetailList getCommissionDetailList() {
        return commissionDetailList;
    }

    /**
     * 设置commissionDetailList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionDetailData.CommissionDetailList }
     *     
     */
    public void setCommissionDetailList(CommissionDetailData.CommissionDetailList value) {
        this.commissionDetailList = value;
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
     *         &lt;element name="commissionDetail" type="{http://controller.agent.soa.enuoai.com/}monthCommissionDetail" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<MonthCommissionDetail> commissionDetail;

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
         * {@link MonthCommissionDetail }
         * 
         * 
         */
        public List<MonthCommissionDetail> getCommissionDetail() {
            if (commissionDetail == null) {
                commissionDetail = new ArrayList<MonthCommissionDetail>();
            }
            return this.commissionDetail;
        }

    }

}
