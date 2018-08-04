package com.example.example.carrierCup;

import java.util.*;
import java.util.Map.Entry;

public class MapClass2 {
	
	
	  
	public static void main(String[] args) {    
	    //Creating map of Books    
	    Map map=new LinkedHashMap();    
	    //Creating Books    
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(2,b2);  
	    map.put(1,b1);  
	    map.put(3,b3);  
	      
	    Set s=map.entrySet();
	    Iterator it=s.iterator();
	    while(it.hasNext()){
	    	Map.Entry e=(Map.Entry) it.next();
	    	Book b=(Book) e.getValue();
	    	//System.out.println(e.getValue()+"------"+e.getKey());
	    	System.out.println(b.author+"------"+b.id+"------"+b.name+"------"+b.publisher+"------"+e.getKey());
	    }
	    
	   /* //Traversing map  
	    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Book b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	  */     
	}    


}
