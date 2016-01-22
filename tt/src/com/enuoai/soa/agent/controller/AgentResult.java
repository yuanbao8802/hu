
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>agentResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="agentResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://controller.agent.soa.enuoai.com/}result">
 *       &lt;sequence>
 *         &lt;element name="agentInfoVo" type="{http://controller.agent.soa.enuoai.com/}agentInfoVo" minOccurs="0"/>
 *         &lt;element name="soaUserPasswordTokenVo" type="{http://controller.agent.soa.enuoai.com/}SoaUserPasswordToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agentResult", propOrder = {
    "agentInfoVo",
    "soaUserPasswordTokenVo"
})
public class AgentResult
    extends Result
{

    protected AgentInfoVo agentInfoVo;
    protected SoaUserPasswordToken soaUserPasswordTokenVo;

    /**
     * 获取agentInfoVo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgentInfoVo }
     *     
     */
    public AgentInfoVo getAgentInfoVo() {
        return agentInfoVo;
    }

    /**
     * 设置agentInfoVo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgentInfoVo }
     *     
     */
    public void setAgentInfoVo(AgentInfoVo value) {
        this.agentInfoVo = value;
    }

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

}
