
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getRenewList complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getRenewList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="renewParam" type="{http://controller.agent.soa.enuoai.com/}RenewParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRenewList", propOrder = {
    "renewParam"
})
public class GetRenewList {

    protected RenewParam renewParam;

    /**
     * ��ȡrenewParam���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RenewParam }
     *     
     */
    public RenewParam getRenewParam() {
        return renewParam;
    }

    /**
     * ����renewParam���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RenewParam }
     *     
     */
    public void setRenewParam(RenewParam value) {
        this.renewParam = value;
    }

}
