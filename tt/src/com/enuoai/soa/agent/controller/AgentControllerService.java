package com.enuoai.soa.agent.controller;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2015-12-25T10:45:34.931+08:00
 * Generated source version: 2.5.9
 * 
 */
@WebServiceClient(name = "AgentControllerService", 
                  wsdlLocation = "http://192.168.1.239:8088/service/agent?wsdl",
                  targetNamespace = "http://controller.agent.soa.enuoai.com/") 
public class AgentControllerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://controller.agent.soa.enuoai.com/", "AgentControllerService");
    public final static QName AgentControllerPort = new QName("http://controller.agent.soa.enuoai.com/", "AgentControllerPort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.1.239:8088/service/agent?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AgentControllerService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.1.239:8088/service/agent?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AgentControllerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AgentControllerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AgentControllerService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AgentControllerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AgentControllerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AgentControllerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AgentController
     */
    @WebEndpoint(name = "AgentControllerPort")
    public AgentController getAgentControllerPort() {
        return super.getPort(AgentControllerPort, AgentController.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AgentController
     */
    @WebEndpoint(name = "AgentControllerPort")
    public AgentController getAgentControllerPort(WebServiceFeature... features) {
        return super.getPort(AgentControllerPort, AgentController.class, features);
    }

}