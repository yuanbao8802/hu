
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>registerAgent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="registerAgent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="soaUserPasswordTokenVo" type="{http://controller.agent.soa.enuoai.com/}SoaUserPasswordToken" minOccurs="0"/>
 *         &lt;element name="agentInfo" type="{http://controller.agent.soa.enuoai.com/}agentInfoVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerAgent", propOrder = {
    "soaUserPasswordTokenVo",
    "agentInfo"
})
public class RegisterAgent {

    protected SoaUserPasswordToken soaUserPasswordTokenVo;
    protected AgentInfoVo agentInfo;

    /**
     * 获取soaUserPasswordTokenVo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SoaUserPasswordToken }
     *     
     */
    public SoaUserPasswordToken getSoaUserPasswordTokenVo() {
        return soaUserPasswordTokenVo;
    }

    /**
     * 设置soaUserPasswordTokenVo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SoaUserPasswordToken }
     *     
     */
    public void setSoaUserPasswordTokenVo(SoaUserPasswordToken value) {
        this.soaUserPasswordTokenVo = value;
    }

    /**
     * 获取agentInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgentInfoVo }
     *     
     */
    public AgentInfoVo getAgentInfo() {
        return agentInfo;
    }

    /**
     * 设置agentInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgentInfoVo }
     *     
     */
    public void setAgentInfo(AgentInfoVo value) {
        this.agentInfo = value;
    }

}
