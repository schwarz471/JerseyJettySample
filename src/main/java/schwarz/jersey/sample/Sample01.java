package schwarz.jersey.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sample01")
public class Sample01 {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sample01() {
		String message = "<b>Hello, World!</b>";
		return message;
	}
}
