package com.java.restws.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.java.restws.messenger.database.DatabaseClass;
import com.java.restws.messenger.model.Message;

public class MessageService {
	
	public MessageService(){
		messages.put(1l, new Message(1,"hello","tharun")); 
		messages.put(2l, new Message(2,"hjkj!!","rakesh"));
		messages.put(3l, new Message(3,"h!ffgd!","vivek"));
		messages.put(4l, new Message(4,"vvvte","imran"));
		messages.put(5l, new Message(5,"hsdjb","kasi"));
			
	}
	
	private Map<Long, Message> messages=DatabaseClass.getMessage();
	
	public List<Message> getAllMessages(){
		
		return new ArrayList<Message>(messages.values());
		
	}
	
	public Message getmessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
		
	}
	public Message updatemessage(Message message){
		if(message.getId()<=0){
			return null;
		}messages.put(message.getId(), message);
		return message;
		
	}
	
	public Message removeMessage(Long id){
		return messages.remove(id);
	}

}