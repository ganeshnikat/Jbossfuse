package com.techpro.services;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.techpro.model.Employee;

@Path("/")
public class EmployeeServices {
	
	@POST
	@Path("/show-employees")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Map<String, Object>> showEmployees() {
		return null;
	}

	@POST
	@Path("/add-employee")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int addEmployee(Employee employee) {
		return 0;
	}
}
