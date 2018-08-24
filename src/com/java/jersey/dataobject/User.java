package com.java.jersey.dataobject;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

import java.util.List;
import java.util.HashMap;

//@XmlRootElement(name = "user")
public class User {
	
	
	private String username;
	private HashMap<String,String> userMap;
	private List<String> userList;
	
	@XmlElement(name = "username")
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@XmlElement(name = "user")
	public HashMap<String,String> getUserMap() {
		return this.userMap;
	}
	
	public void setUserMap(HashMap<String,String> userMap) {
		this.userMap = userMap;
	}
	
	@XmlElement(name = "userList")
	public List<String> getUserList() {
		return this.userList;
	}
	
	public void setUserList(List<String> userList) {
		this.userList = userList;
	}

}
