package com.java.jersey;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;


public class MyResourceConfig extends ResourceConfig {
	
	public MyResourceConfig() {
		packages("com.java.jersey.resources",
				 "com.java.jersey.providers",
				 "com.java.jersey.filters")
			.register(MultiPartFeature.class)
			.property(ServerProperties.TRACING, "ON_DEMAND");
	}

}
