package tests.integration.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;

public class HelloWorldServiceTest extends JerseyTest {

	public HelloWorldServiceTest() throws Exception {
        super("service");
    }

    @Test
    public void testHelloWorld() {
        WebResource webResource = resource();
        String responseMsg = webResource.path("hello").get(String.class);
        assertEquals("Hello World!", responseMsg);
    }

}
