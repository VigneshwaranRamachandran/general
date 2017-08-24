package com.SoftwareAg;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/customers")
public class TestingRestFullService {

	@GET
	@Produces("text/plain")
	@Path("{id}")
	public Response getCustomerDetails(@PathParam("id") String custId) {

		// CODE TO FETCH CUSTOMER DETAILS FROM THE DATABASE USING CUSTOMER ID
		String output = "Customer Details With ID " + custId + " Has Been fetched Successfully";
		return Response.status(200).entity(output).build();
	}

	@POST
	@Produces("text/plain")
	@Path("{id}")
	public Response insertCustomer(@PathParam("id") String custId) {

		// CODE TO INSERT CUSTOMER DETAILS USING CUSTOMER ID
		String output = "Customer Data With ID " + custId + " Has Been Saved Successfully";
		return Response.status(200).entity(output).build();
	}

	@PUT
	@Produces("text/plain")
	@Path("{id}")
	public Response updateCustomerDetails(@PathParam("id") String custId) {

		// CODE TO UPDATE CUSTOMER DETAILS USING CUSTOMER ID
		String output = "Customer Data With ID " + custId + " Has Been Updated Successfully";
		return Response.status(200).entity(output).build();
	}

	@DELETE
	@Produces("text/plain")
	@Path("{id}")
	public Response deleteCustomer(@PathParam("id") String custId) {

		// CODE TO DELETE CUSTOMER DETAILS USING CUSTOMER ID
		String output = "Customer With ID " + custId + " Has Been Deleted From the Database.";
		return Response.status(200).entity(output).build();
	}

}
