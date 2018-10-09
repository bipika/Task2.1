package currencyWS;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class PServiceImpl implements PService {
	@Override
	@WebMethod
	public String getCurrencyUnit(String code) {
		if (code.equals("USD")) {
			return "dollars";
		}
		else {
			return "";
		}
	}
}