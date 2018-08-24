package com.java.jersey.resources;

import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.Consumes;

import com.java.jersey.dataobject.User;
import com.java.jersey.dataobject.SuperUser;

@Path("users")
public class UserResources {
	
	@GET
	@Path("user")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getUser(@QueryParam("user") String user) {
		//User us = new User();
		//us.setUsername(user);
		SuperUser us = new SuperUser();
		us.setUsername(user);
		us.setSuperUser("Y");
		us.setUsername(user);
		return Response.status(200).entity(us).build();
		//return us;
	}
	
	@GET
	@Path("{user}/userpath")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getUserPath(@PathParam("user") String user) {
		
		User us = new User();
		HashMap<String,String> userMap = new HashMap<String,String>();
		List<String> userList = new ArrayList<String>();
		userList.add("Vishak");
		userList.add("Vivek");
		userMap.put("Vishak", "Vishak1");
		userMap.put("Vivek", "Vivek1");
		
		us.setUserMap(userMap);
		us.setUsername(user);
		us.setUserList(userList);
		return Response.status(200).entity(us).build();
		
	}
	

}
