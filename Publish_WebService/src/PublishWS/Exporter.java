package PublishWS;

import javax.xml.ws.Endpoint;

public class Exporter {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8084/MyServices/pservice", new PServiceImpl());
	}
}