
package com.enuoai.soa.agent.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>commissionDetailResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="commissionDetailResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://controller.agent.soa.enuoai.com/}result">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://controller.agent.soa.enuoai.com/}CommissionDetailData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commissionDetailResult", propOrder = {
    "data"
})
public class CommissionDetailResult
    extends Result
{

    protected CommissionDetailData data;

    /**
     * ��ȡdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommissionDetailData }
     *     
     */
    public CommissionDetailData getData() {
        return data;
    }

    /**
     * ����data���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionDetailData }
     *     
     */
    public void setData(CommissionDetailData value) {
        this.data = value;
    }

}
