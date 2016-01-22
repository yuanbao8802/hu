
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>agentInfoResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="agentInfoResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://controller.agent.soa.enuoai.com/}result">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://controller.agent.soa.enuoai.com/}AgentInfo101" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agentInfoResult", propOrder = {
    "data"
})
public class AgentInfoResult
    extends Result
{

    protected AgentInfo101 data;

    /**
     * 获取data属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgentInfo101 }
     *     
     */
    public AgentInfo101 getData() {
        return data;
    }

    /**
     * 设置data属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgentInfo101 }
     *     
     */
    public void setData(AgentInfo101 value) {
        this.data = value;
    }

}
