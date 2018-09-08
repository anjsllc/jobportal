package com.example.example.carrierCup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1{
	public static void main(String[] args) {
		
		List l=new ArrayList();
		for(int j=1;j<=10;j++){
			l.add(j);
		}
		System.out.println(l);
	
		Iterator it=l.iterator();
		while(it.hasNext()){
			Integer i=(Integer)it.next();
			if(i%2==0){
			System.out.println(i);}
			else it.remove();
		}
		System.out.println(l);
	}

}
