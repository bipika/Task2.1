
package WS_Currency;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WS_Currency package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCurrencyUnit_QNAME = new QName("http://currencyWS/", "getCurrencyUnit");
    private final static QName _GetCurrencyUnitResponse_QNAME = new QName("http://currencyWS/", "getCurrencyUnitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WS_Currency
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCurrencyUnit }
     * 
     */
    public GetCurrencyUnit createGetCurrencyUnit() {
        return new GetCurrencyUnit();
    }

    /**
     * Create an instance of {@link GetCurrencyUnitResponse }
     * 
     */
    public GetCurrencyUnitResponse createGetCurrencyUnitResponse() {
        return new GetCurrencyUnitResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://currencyWS/", name = "getCurrencyUnit")
    public JAXBElement<GetCurrencyUnit> createGetCurrencyUnit(GetCurrencyUnit value) {
        return new JAXBElement<GetCurrencyUnit>(_GetCurrencyUnit_QNAME, GetCurrencyUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyUnitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://currencyWS/", name = "getCurrencyUnitResponse")
    public JAXBElement<GetCurrencyUnitResponse> createGetCurrencyUnitResponse(GetCurrencyUnitResponse value) {
        return new JAXBElement<GetCurrencyUnitResponse>(_GetCurrencyUnitResponse_QNAME, GetCurrencyUnitResponse.class, null, value);
    }

}
