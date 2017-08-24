package com.softwareag;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class LoveCalu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/plain");
		
		String name1 = req.getParameter("name1");
		String name2 = req.getParameter("name2");
		
		HttpResponse<JsonNode> response=null;
		try {
			response = Unirest
					.get("https://love-calculator.p.mashape.com/getPercentage?fname=" + name1 + "&sname=" + name2)
					.header("X-Mashape-Key", "dWvY47plf7msh8WOWECvNNIfI5DHp1cmXlxjsnQ8TojHiyxE8v")
					.header("Accept", "application/json").asJson();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.getWriter().println(response);

	}

}