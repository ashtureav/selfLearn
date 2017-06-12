/**
 */
package Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.w3c.dom.stylesheets.MediaList;

/**
 * @author Hitesh
 *
 */
@Path("/home")
public class HomeController {

	@GET
	@Path("/address")
	public String getHome(){
		return "Ghar";
	}
	@GET
	@Path("/addition")
	@Produces(MediaType.TEXT_PLAIN)
	public String getTotal(@QueryParam("num1") String a, @QueryParam("num2") String b){
		int c = Integer.parseInt(a)+ Integer.parseInt(b);
		
		return "" + c;
	}
}
