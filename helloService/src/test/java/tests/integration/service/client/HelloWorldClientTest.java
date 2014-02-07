package tests.integration.service.client;

import static org.junit.Assert.*;

import java.net.URI;

import org.junit.Test;

import service.client.HelloWorldServiceClient;

import com.sun.jersey.test.framework.JerseyTest;

public class HelloWorldClientTest extends JerseyTest {
	
	public static String JERSEY_SERVER_TEST_ADDRESS = "http://localhost:9998";
	
	public HelloWorldClientTest() throws Exception {
        super("tests.integration.service.client");
    }

	@Test
	public void CallHello_WhenCallIsMade_HelloWorldIsReturned() {
		HelloWorldServiceClient client = new HelloWorldServiceClient(JERSEY_SERVER_TEST_ADDRESS);
		
		String response = client.callHello();
		
		assertEquals("Hello World!", response);
	}

}
