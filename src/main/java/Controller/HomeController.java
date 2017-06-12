/**
 */
package Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Hitesh
 *
 */
@Path("/home")
public class HomeController {

	@GET
	public String getHome(){
		return "Ghar";
	}
}
