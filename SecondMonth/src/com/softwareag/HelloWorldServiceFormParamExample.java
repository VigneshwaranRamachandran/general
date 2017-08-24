package com.softwareag;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
 
@Path("/formparam")
public class HelloWorldServiceFormParamExample {
    
	
	    
	 @POST
	    @Path("/test")
	    @Produces("text/html")
	    public Response getResultByPassingValue(
	                    @FormParam("name1") String name1,
	                    @FormParam("name2") String name2) throws UnirestException {
	        
		 HttpResponse<JsonNode> response = Unirest.get("https://love-calculator.p.mashape.com/getPercentage?fname="+name1+"&sname="+name2)
				 .header("X-Mashape-Key", "dWvY47plf7msh8WOWECvNNIfI5DHp1cmXlxjsnQ8TojHiyxE8v")
				 .header("Accept", "application/json")
				 .asJson();
		
	        return Response.status(200).entity(response).build();
	 
	    }
}