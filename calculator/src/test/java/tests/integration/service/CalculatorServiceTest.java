package tests.integration.service;

import static org.junit.Assert.*;

import javax.ws.rs.core.MultivaluedMap;

import org.junit.Test;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.sun.jersey.test.framework.JerseyTest;

public class CalculatorServiceTest extends JerseyTest {

	public CalculatorServiceTest() throws Exception {
        super("service");
    }
	
	@Test
	public void Addition_ServiceShouldAdd1And3_AndRespondWithResult4() {
        WebResource webResource = resource();
        
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("firstNumber", "1");
        params.add("secondNumber", "2");
        
        String responseMsg = webResource.path("calculator").queryParams(params).get(String.class);
        assertEquals("{\"result\":\"3\"}", responseMsg);
	}
	
	@Test
	public void Addition_ServiceShouldAdd100And350_AndRespondWithResult450() {
        WebResource webResource = resource();
        
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("firstNumber", "100");
        params.add("secondNumber", "350");
        
        String responseMsg = webResource.path("calculator").queryParams(params).get(String.class);
        assertEquals("{\"result\":\"450\"}", responseMsg);
	}

}
