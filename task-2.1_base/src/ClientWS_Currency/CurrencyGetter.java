package ClientWS_Currency;

import WS_Currency.PServiceImpl;
import WS_Currency.PServiceImplService;;

public class CurrencyGetter {
    public CurrencyGetter() {}
	
	public String getCurrencyUnitFromCode(String code) {
		
		PServiceImplService currency_service = new PServiceImplService(); //created service object
        PServiceImpl currency_serviceSOAP = currency_service.getPServiceImplPort(); //create SOAP object (a port of the service)
        String result = currency_serviceSOAP.getCurrencyUnit(code); 
        
        return result;
	}

}
