
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getCommissionDetails complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getCommissionDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionDetailsParm" type="{http://controller.agent.soa.enuoai.com/}CommissionDetailsParm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCommissionDetails", propOrder = {
    "commissionDetailsParm"
})
public class GetCommissionDetails {

    protected CommissionDetailsParm commissionDetailsParm;

    /**
     * ��ȡcommissionDetailsParm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommissionDetailsParm }
     *     
     */
    public CommissionDetailsParm getCommissionDetailsParm() {
        return commissionDetailsParm;
    }

    /**
     * ����commissionDetailsParm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionDetailsParm }
     *     
     */
    public void setCommissionDetailsParm(CommissionDetailsParm value) {
        this.commissionDetailsParm = value;
    }

}
