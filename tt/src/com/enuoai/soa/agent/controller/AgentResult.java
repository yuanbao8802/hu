
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>agentResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡagentInfoVo���Ե�ֵ��
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
     * ����agentInfoVo���Ե�ֵ��
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

}
