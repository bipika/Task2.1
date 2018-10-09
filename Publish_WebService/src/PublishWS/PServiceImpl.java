package PublishWS;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class PServiceImpl implements PService {
	@Override
	@WebMethod
	public int multiply(int a, int b) { return a*b;}
}