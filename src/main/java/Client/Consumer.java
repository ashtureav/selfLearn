package Client;

import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;


public class Consumer {


	public static void main (String args[]) {
		
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/selfLearn/rest/home/address");
		String output = webResource.get(String.class);
		System.out.println(output);
		
		webResource = client.resource("http://localhost:8080/selfLearn/rest/home/addition");
		MultivaluedMap <String, String> queryparams = new MultivaluedMapImpl();
		queryparams.add("num1", "120");
		queryparams.add("num2", "650");
		output = webResource.queryParams(queryparams).get(String.class);
		System.out.println(output);
		
	}
	
}
