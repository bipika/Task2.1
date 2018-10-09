package ClientWS_Convertor;

import java.math.BigDecimal;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

public class NumberConvertor {
    public NumberConvertor() {}
	    
	public String convert2dollars(String inputStr) {
		BigDecimal input_D = new BigDecimal(inputStr);
		NumberConversion NC_service = new NumberConversion(); //created service object
        NumberConversionSoapType NC_serviceSOAP = NC_service.getNumberConversionSoap(); //create SOAP object (a port of the service)
        String result = NC_serviceSOAP.numberToDollars(input_D);  
        return result;
	}
}
