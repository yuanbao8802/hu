
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getCommission complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcommissionParm���Ե�ֵ��
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
     * ����commissionParm���Ե�ֵ��
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
