
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getRenewList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取renewParam属性的值。
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
     * 设置renewParam属性的值。
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
