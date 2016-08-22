package com.restService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest")
public class Service {

	@GET
	@Path("/name")
	@Produces(MediaType.TEXT_PLAIN)
	public String printName(){
		return "WellsFargo";
	}
}
