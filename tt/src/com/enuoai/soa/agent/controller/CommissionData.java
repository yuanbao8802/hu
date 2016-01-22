
package com.enuoai.soa.agent.controller;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CommissionData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CommissionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monthCommissionList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="monthCommission" type="{http://controller.agent.soa.enuoai.com/}monthAmount" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalOpenAccountCommission" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalCommission" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionData", propOrder = {
    "monthCommissionList",
    "totalOpenAccountCommission",
    "totalCommission"
})
public class CommissionData {

    @XmlElement(required = true)
    protected CommissionData.MonthCommissionList monthCommissionList;
    protected Double totalOpenAccountCommission;
    protected Double totalCommission;

    /**
     * 获取monthCommissionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommissionData.MonthCommissionList }
     *     
     */
    public CommissionData.MonthCommissionList getMonthCommissionList() {
        return monthCommissionList;
    }

    /**
     * 设置monthCommissionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionData.MonthCommissionList }
     *     
     */
    public void setMonthCommissionList(CommissionData.MonthCommissionList value) {
        this.monthCommissionList = value;
    }

    /**
     * 获取totalOpenAccountCommission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalOpenAccountCommission() {
        return totalOpenAccountCommission;
    }

    /**
     * 设置totalOpenAccountCommission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalOpenAccountCommission(Double value) {
        this.totalOpenAccountCommission = value;
    }

    /**
     * 获取totalCommission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCommission() {
        return totalCommission;
    }

    /**
     * 设置totalCommission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCommission(Double value) {
        this.totalCommission = value;
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
     *         &lt;element name="monthCommission" type="{http://controller.agent.soa.enuoai.com/}monthAmount" maxOccurs="unbounded" minOccurs="0"/>
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
        "monthCommission"
    })
    public static class MonthCommissionList {

        protected List<MonthAmount> monthCommission;

        /**
         * Gets the value of the monthCommission property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the monthCommission property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMonthCommission().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonthAmount }
         * 
         * 
         */
        public List<MonthAmount> getMonthCommission() {
            if (monthCommission == null) {
                monthCommission = new ArrayList<MonthAmount>();
            }
            return this.monthCommission;
        }

    }

}
