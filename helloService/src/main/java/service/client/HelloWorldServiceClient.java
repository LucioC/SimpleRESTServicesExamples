package service.client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class HelloWorldServiceClient {
	
	private String serverAddress;
	
	public HelloWorldServiceClient(String serverAddress)
	{
		this.serverAddress = serverAddress;
	}

	public String callHello() {

		Client c = Client.create();
		WebResource r = c.resource(this.serverAddress + "/hello");
		
		String response = r.accept(MediaType.TEXT_PLAIN).get(String.class);
		return response;
	}

}
