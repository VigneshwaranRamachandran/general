package com.SoftwareAg;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/price")
public class Controller {

	
  @GET
  @Produces("text/html")
  public Response getLocalCust() {
	  			
           String output = "I am from 'getLocalCust' method";
           return Response.status(200).entity(output).build();
  }
 
 
 
}