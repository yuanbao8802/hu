
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>registerAgent complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsoaUserPasswordTokenVo���Ե�ֵ��
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
     * ����soaUserPasswordTokenVo���Ե�ֵ��
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
     * ��ȡagentInfo���Ե�ֵ��
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
     * ����agentInfo���Ե�ֵ��
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
