package com.java.jersey.providers;

import org.glassfish.jersey.server.spi.Container;
import org.glassfish.jersey.server.spi.ContainerLifecycleListener;

import com.java.jersey.dataobject.HandshakeResponse;

import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

@Provider
public class InitHook implements ContainerLifecycleListener {

	@Override
	public void onReload(Container arg0) {
		// Called when application is reloaded
		System.out.println("Application Reloaded");
		
	}

	@Override
	public void onShutdown(Container arg0) {
		// Called when application shutdown
		System.out.println("Application Shutdown");
	}

	@Override
	public void onStartup(Container arg0) {
		// Called when application startup
		System.out.println("Application Start");
		try {
			//System.out.println("JAXBContext used = "+JAXBContext.newInstance(HandshakeResponse.class).getClass().toString());
			HandshakeResponse handResponse = new HandshakeResponse();
			JAXBContext jaxbContext = JAXBContext.newInstance(HandshakeResponse.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(handResponse, System.out);
			
		} catch(JAXBException jaxe) {
			
		}
	}

}
