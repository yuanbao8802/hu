
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>settleAccount complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="settleAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountParam" type="{http://controller.agent.soa.enuoai.com/}accountParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "settleAccount", propOrder = {
    "accountParam"
})
public class SettleAccount {

    protected AccountParam accountParam;

    /**
     * ��ȡaccountParam���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountParam }
     *     
     */
    public AccountParam getAccountParam() {
        return accountParam;
    }

    /**
     * ����accountParam���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountParam }
     *     
     */
    public void setAccountParam(AccountParam value) {
        this.accountParam = value;
    }

}
