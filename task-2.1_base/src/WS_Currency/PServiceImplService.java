
package WS_Currency;

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
@WebServiceClient(name = "PServiceImplService", targetNamespace = "http://currencyWS/", wsdlLocation = "http://localhost:8085/MyServices/pservice?wsdl")
public class PServiceImplService
    extends Service
{

    private final static URL PSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName PSERVICEIMPLSERVICE_QNAME = new QName("http://currencyWS/", "PServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/MyServices/pservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        PSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public PServiceImplService() {
        super(__getWsdlLocation(), PSERVICEIMPLSERVICE_QNAME);
    }

    public PServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PSERVICEIMPLSERVICE_QNAME, features);
    }

    public PServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, PSERVICEIMPLSERVICE_QNAME);
    }

    public PServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PSERVICEIMPLSERVICE_QNAME, features);
    }

    public PServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PServiceImpl
     */
    @WebEndpoint(name = "PServiceImplPort")
    public PServiceImpl getPServiceImplPort() {
        return super.getPort(new QName("http://currencyWS/", "PServiceImplPort"), PServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PServiceImpl
     */
    @WebEndpoint(name = "PServiceImplPort")
    public PServiceImpl getPServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://currencyWS/", "PServiceImplPort"), PServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw PSERVICEIMPLSERVICE_EXCEPTION;
        }
        return PSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
