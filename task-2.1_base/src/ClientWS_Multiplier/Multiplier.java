package ClientWS_Multiplier;

import WS_Multiplier.PServiceImpl;
import WS_Multiplier.PServiceImplService;

public class Multiplier {
    public Multiplier() {}
	
	public String MultiplyIntegers(int num1, int num2) {
		
		PServiceImplService multiply_service = new PServiceImplService(); //created service object
        PServiceImpl multply_serviceSOAP = multiply_service.getPServiceImplPort(); //create SOAP object (a port of the service)
        int result = multply_serviceSOAP.multiply(num1, num2); 
        
        return Integer.toString(result);
	}

}
