package com.example.example.carrierCup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapClass1 {
	public static void main(String[] args) {
		Map map=new HashMap();
		 map.put(1,"Amit");  
		 map.put(5,"Rahul");  
		 map.put(2,"Jai");  
		 map.put(6,"Amit");
		 System.out.println(map);
		 Set s=	 map.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()){
			//System.out.println(it.next());
			Map.Entry entry=(Map.Entry)it.next();
			System.out.println(entry.getValue()+"---"+entry.getKey());
		}
		
	}

}
