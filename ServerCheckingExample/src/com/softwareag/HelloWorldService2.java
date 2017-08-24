package com.SoftwareAg;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/nri2")
public class HelloWorldService2 {

	
  @GET
  @Produces("text/html")
  public Response getLocalCust() {
	  			
           String output = "I am from 'getLocalCust' method";
           return Response.status(200).entity(output).build();
  }
 
  @GET
  @Path("/nri")
  @Produces("text/html")
  public Response getNriCust() {
 
            String output = "I am from 'getNriCust' method";
            return Response.status(200).entity(output).build();
  }
  @GET
  @Path("/nri2")
  @Produces("text/html")
  public Response getNriCust2() {
 
            String output = "I am from 'getNriCust' method";
            return Response.status(200).entity(output).build();
  }
  
 
}