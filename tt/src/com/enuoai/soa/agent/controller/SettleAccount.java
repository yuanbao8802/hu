
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>settleAccount complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取accountParam属性的值。
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
     * 设置accountParam属性的值。
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
