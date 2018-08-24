package com.java.jersey.filters;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.container.ContainerResponseContext;

/*Filters should be annotatted with Provider annotation setting the priority, that enbles the order of execution.*/
@Provider
@Priority(1)
public class AuditFilter implements ContainerRequestFilter,ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
		
		System.out.println(responseContext.getStatusInfo());
		
	}

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("Query Parameters::"+requestContext.getUriInfo().getQueryParameters());
		System.out.println("Path Parameters:::"+requestContext.getUriInfo().getPathParameters());
		
	}

}
