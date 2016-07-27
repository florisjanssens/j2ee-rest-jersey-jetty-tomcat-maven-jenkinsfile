package ie.farrengold.javaee7;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * @author Brian Dinneen
 * @since July 2016
 *
 */
@Path("hello")
public class HelloWorld {

	@Context
	private UriInfo context;

	/** Creates a new instance of HelloWorld */
	public HelloWorld() {
	}

	/**
	 * Retrieves representation of an instance of helloWorld.HelloWorld
	 * 
	 * @return an instance of java.lang.String
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHtml() {
		return "<html lang=\"en\"><body><h1>Hello, World!!</h1><h2>Gareth in the house</h2></body></html>";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getPlain() {
		return "Hello, World!! - Plain text, use curl to get me";
	}
}
