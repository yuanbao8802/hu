
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateAgentInfo101 complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡagentInfo���Ե�ֵ��
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
     * ����agentInfo���Ե�ֵ��
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
