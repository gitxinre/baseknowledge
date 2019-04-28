package ws.cxf.server;

import ws.cxf.server.impl.PersonServiceImpl;

import javax.xml.ws.Endpoint;

public class PublishServer {
	public static void main(String[] args) {
		Endpoint.publish("http://192.168.9.174:9899/personService", new PersonServiceImpl());
		System.out.println("fabucheng功！");
	}

}
