
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>uploadAgentFaceImg complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="uploadAgentFaceImg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentFaceImgParam" type="{http://controller.agent.soa.enuoai.com/}AgentFaceImgParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadAgentFaceImg", propOrder = {
    "agentFaceImgParam"
})
public class UploadAgentFaceImg {

    protected AgentFaceImgParam agentFaceImgParam;

    /**
     * 获取agentFaceImgParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgentFaceImgParam }
     *     
     */
    public AgentFaceImgParam getAgentFaceImgParam() {
        return agentFaceImgParam;
    }

    /**
     * 设置agentFaceImgParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgentFaceImgParam }
     *     
     */
    public void setAgentFaceImgParam(AgentFaceImgParam value) {
        this.agentFaceImgParam = value;
    }

}
