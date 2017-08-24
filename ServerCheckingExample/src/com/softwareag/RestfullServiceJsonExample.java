package com.SoftwareAg;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/json")
public class RestfullServiceJsonExample {

	@GET
	@Path("/{cusNo}/{CustName}/{CustCountry}")
	@Produces("application/json")
	public JsonPOJO producejomerDetailsinJSON(@PathParam("cusNo") int no,@PathParam("CustName") String CustName,@PathParam("CustCountry") String CustCountry) {

		JsonPOJO j = new JsonPOJO();
		j.setCustNo(no);
		j.setCustName(CustName);
		j.setCustCountry(CustCountry);
		return j;
	}

}
