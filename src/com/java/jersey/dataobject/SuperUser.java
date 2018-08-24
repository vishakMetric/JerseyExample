package com.java.jersey.dataobject;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "users")
public class SuperUser extends User {
	
	private String superUser;
	
	public String getSuperUser() {
		return this.superUser;
	}
	
	public void setSuperUser(String superUser) {
		this.superUser = superUser;
	}
}
