
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>uploadAgentFaceImg complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡagentFaceImgParam���Ե�ֵ��
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
     * ����agentFaceImgParam���Ե�ֵ��
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
