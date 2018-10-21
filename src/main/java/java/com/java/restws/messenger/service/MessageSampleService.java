package com.java.restws.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.java.restws.messenger.model.Message;

public class MessageSampleService {
	
	
public List<Message> getAllMessages(){
		
		Message m1=new Message(1l,"hello","tharun");
		Message m2=new Message(2l,"hjkj!!","rakesh");
		Message m3=new Message(3l,"h!ffgd!","vivek");
		Message m4=new Message(4l,"hreg!!","imran");
		Message m5=new Message(5l,"hgwr!!","kasi");
		
		List<Message> list =new ArrayList<>();
		
		list.add(m2);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		return list;
	}

}
