package com.SoftwareAg;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/xmlparse")
public class XmlRestFullService {


	@GET
	@Path("/{cusNo}/{CustName}/{CustCountry}")
	@Produces(MediaType.APPLICATION_XML)
	public XmlPOJO producejomerDetailsinJSON(@PathParam("cusNo") int no,@PathParam("CustName") String CustName,@PathParam("CustCountry") String CustCountry)  {

		XmlPOJO j = new XmlPOJO();
		j.setCustNo(no);
		j.setCustName(CustName);
		j.setCustCountry(CustCountry);
		
		return j;
	}

}
