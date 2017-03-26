package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/hello")
public class HiRestfull {
	
	@GET
	@Produces(MediaType.TEXT_XML)
    public String hijava()
{
	String k="<?xml version ='1.0'?>"
			+ "<hi>restful xml </hi>";
	
			return k;
}

	
}
