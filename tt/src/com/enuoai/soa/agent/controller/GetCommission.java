
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getCommission complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getCommission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionParm" type="{http://controller.agent.soa.enuoai.com/}CommissionParm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCommission", propOrder = {
    "commissionParm"
})
public class GetCommission {

    protected CommissionParm commissionParm;

    /**
     * 获取commissionParm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommissionParm }
     *     
     */
    public CommissionParm getCommissionParm() {
        return commissionParm;
    }

    /**
     * 设置commissionParm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionParm }
     *     
     */
    public void setCommissionParm(CommissionParm value) {
        this.commissionParm = value;
    }

}
