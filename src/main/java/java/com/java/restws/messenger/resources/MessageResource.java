package com.java.restws.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.restws.messenger.model.Message;
import com.java.restws.messenger.service.MessageService;

@Path("messages")   // giving path to class file
public class MessageResource {
	MessageService messageService =new MessageService();
	
	@GET   // http method match to java methods
	@Produces(MediaType.APPLICATION_JSON)   // setting output typeresponse
	public List<Message> getMessages(){
		
		return messageService.getAllMessages();
	}

	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	public Message test(@PathParam("messageId") long messageId){
		
		return messageService.getmessage(messageId);
	}
	
}
