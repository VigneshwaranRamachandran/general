package com.SoftwareAg;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/guindy")
public class ResponseImage {

	
	 @GET
	  @Produces("text/html")
	  public Response getLocalCust() {
		  			
	           String output = "<html><body><a href='http://localhost:8080/RestfullWebservice/guindy/railwaystation.png'>railwaystation</a><br><a href='http://localhost:8080/RestfullWebservice/guindy/industrailestate.jpg'>industrial estate</a><br></body></html>";
	          // System.out.println("inside class one");
	           return Response.status(200).entity(output).build();
	  }
	 
	  @GET
	  @Path("{railwaystation}")
	  @Produces({ "image/png"})
	  public Response getFullImage(  @PathParam("railwaystation") String name) throws IOException {
		
		  File s1=new File("C:/vignesh/SoftwareAg/RestfullWebservice/src/com/SoftwareAg/"+name);
		  BufferedImage i = ImageIO.read(s1);
		  System.out.println("s");
		  System.out.println(name);
		  System.out.println("s");
	    return Response.ok(i).build();
	  }	
//	  @GET
//	  @Path("/industrailestate.jpg")
//	  @Produces({ "image/png"})
//	  public Response getFullImage2() throws IOException {
//		  File s=new File("C:/vignesh/SoftwareAg/RestfullWebservice/src/com/SoftwareAg/industrailestate.jpg");
//		  BufferedImage i = ImageIO.read(s);
//		  System.out.println("s");
//		  System.out.println(i);
//		  System.out.println("s");
//	    return Response.ok(i).build();
//	  }	
}
