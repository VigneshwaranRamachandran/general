package com.SoftwareAg;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/matrixparam")
public class HelloWorldServiceMatrixParamExample {
    
	
	    
	    @GET
	    @Produces("text/html")
	    public Response getResultByPassingValue(
	    		  @MatrixParam("nameKey") String name,
	    		  @MatrixParam("countryKey") String country) {
	        
	        String output = "Customer name - "+name+", Country - "+country+"";
	        return Response.status(200).entity(output).build();
	 
	    }
}