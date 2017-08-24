package com.SoftwareAg;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/formparam")
public class HelloWorldServiceFormParamExample {
    
	
	    
	 @POST
	    @Path("/addCustomer")
	    @Produces("text/html")
	    public Response getResultByPassingValue(
	                    @FormParam("nameKey") String name,
	                    @FormParam("countryKey") String country) {
	        
	        String output = "<font face='verdana' size='2'>" +
	                "Web Service has added your Customer information with Name - <u>"+name+"</u>, Country - <u>"+country+"</u></font>";
	        return Response.status(200).entity(output).build();
	 
	    }
}