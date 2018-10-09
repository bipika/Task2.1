package currencyWS;

import javax.xml.ws.Endpoint;

import currencyWS.PServiceImpl;

public class Exporter {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8085/MyServices/pservice", new PServiceImpl());
	}
}