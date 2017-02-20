
package br.com.ghc.back.rest.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebMethodServiceService", targetNamespace = "http://service.ws.soap.back.gch.com.br/", wsdlLocation = "http://localhost:8180/gch-back-soap-0.0.1-SNAPSHOT/WebMethodService?wsdl")
public class WebMethodServiceService
    extends Service
{

    private final static URL WEBMETHODSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBMETHODSERVICESERVICE_EXCEPTION;
    private final static QName WEBMETHODSERVICESERVICE_QNAME = new QName("http://service.ws.soap.back.gch.com.br/", "WebMethodServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8180/gch-back-soap-0.0.1-SNAPSHOT/WebMethodService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBMETHODSERVICESERVICE_WSDL_LOCATION = url;
        WEBMETHODSERVICESERVICE_EXCEPTION = e;
    }

    public WebMethodServiceService() {
        super(__getWsdlLocation(), WEBMETHODSERVICESERVICE_QNAME);
    }

    public WebMethodServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBMETHODSERVICESERVICE_QNAME, features);
    }

    public WebMethodServiceService(URL wsdlLocation) {
        super(wsdlLocation, WEBMETHODSERVICESERVICE_QNAME);
    }

    public WebMethodServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBMETHODSERVICESERVICE_QNAME, features);
    }

    public WebMethodServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebMethodServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebMethodService
     */
    @WebEndpoint(name = "WebMethodServicePort")
    public WebMethodService getWebMethodServicePort() {
        return super.getPort(new QName("http://service.ws.soap.back.gch.com.br/", "WebMethodServicePort"), WebMethodService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebMethodService
     */
    @WebEndpoint(name = "WebMethodServicePort")
    public WebMethodService getWebMethodServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.ws.soap.back.gch.com.br/", "WebMethodServicePort"), WebMethodService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBMETHODSERVICESERVICE_EXCEPTION!= null) {
            throw WEBMETHODSERVICESERVICE_EXCEPTION;
        }
        return WEBMETHODSERVICESERVICE_WSDL_LOCATION;
    }

}