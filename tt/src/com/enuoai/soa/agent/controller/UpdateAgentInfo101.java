
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateAgentInfo101 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="updateAgentInfo101">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentInfo" type="{http://controller.agent.soa.enuoai.com/}AgentInfo101" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAgentInfo101", propOrder = {
    "agentInfo"
})
public class UpdateAgentInfo101 {

    protected AgentInfo101 agentInfo;

    /**
     * 获取agentInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgentInfo101 }
     *     
     */
    public AgentInfo101 getAgentInfo() {
        return agentInfo;
    }

    /**
     * 设置agentInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgentInfo101 }
     *     
     */
    public void setAgentInfo(AgentInfo101 value) {
        this.agentInfo = value;
    }

}
