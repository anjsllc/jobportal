package com.java.restws.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.java.restws.messenger.model.Message;
import com.java.restws.messenger.model.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> messages=new HashMap<>();

	private static Map<Long, Profile> profiles=new HashMap<>();


	public static Map<Long, Message> getEmp(){
		return messages;
	}

	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}

	public static Map<Long, Message> getMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}
