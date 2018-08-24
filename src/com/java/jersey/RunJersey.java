package com.java.jersey;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;

public class RunJersey {
	
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost/").port(9998).build();
	}

	public static final URI BASE_URI = getBaseURI();

	protected static HttpServer startServer() throws IOException {
		
		final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(
				BASE_URI, new MyResourceConfig());
		return server;
	}

	public static void main(String[] args) throws IOException {
		HttpServer httpServer = startServer();
		System.out
				.println(String
						.format("Middleware started with WADL available.Try out %sapplication.wadl",
								BASE_URI, BASE_URI));
		System.in.read();
		httpServer.shutdownNow();
	}
}
