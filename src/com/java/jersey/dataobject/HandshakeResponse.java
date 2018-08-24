package com.java.jersey.dataobject;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

//import java.time.LocalDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handshake", propOrder = {
	    "apiVersion",
	    "authenticated",
		"serverTimestamp",
		"user"
	})
@XmlRootElement(name = "handshake")
public class HandshakeResponse {

	@XmlElement(required = true)
	protected final static String apiVersion = "1.0";
	@XmlElement(required = true)
	protected String authenticated = "NO";
	//@XmlElement(required = true)
	//protected String serverTimestamp = LocalDate.now().toString();
	@XmlElement(required = true)
	protected String user = "admin";
	
	public String getAuthenticated() {
		return authenticated;
	}
	public void setAuthenticated(String authenticated) {
		this.authenticated = authenticated;
	}
	/*public String getServerTimestamp() {
		return serverTimestamp;
	}
	public void setServerTimestamp(String serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
	}*/
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public static String getApiversion() {
		return apiVersion;
	}
	
	
}
