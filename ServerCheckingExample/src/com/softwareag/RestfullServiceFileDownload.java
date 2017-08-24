package com.SoftwareAg;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/downnload")
public class RestfullServiceFileDownload {

	String path = "C:\\vignesh\\f1.txt";
	String path1 ="c:\\vignesh\\f2.png";
	String path2 = "C:\\vignesh\\f2.pdf";

	@GET
	@Path("/txt")
	@Produces("text/plain")

	public Response getCustomerDataFile() {

		File file = new File(path);
		String string="downloaded sucessfully";
		ResponseBuilder rb = Response.ok((Object) file);
		rb.header("Content-Disposition", "attachment; filename=f1.txt");
		return rb.entity(string).build();
	}
	
	@GET
	@Path("/png")

	@Produces("image/png")
	public Response getCustomerDataFile2() {
		File f2 = new File(path1);
		ResponseBuilder rb = Response.ok((Object) f2);
		rb.header("Content-Disposition", "attachment;filename=f2.png");
		return rb.build();
	}

	@GET
	@Path("/pdf")

	@Produces("application/pdf")
	public Response getCustomerDataFile3() {
		File f2 = new File(path2);
		ResponseBuilder rb = Response.ok((Object) f2);
		rb.header("Content-Disposition", "attachment;filename=f1.txt");
		return rb.build();
	}
}