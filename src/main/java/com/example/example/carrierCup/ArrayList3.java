package com.example.example.carrierCup;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {
	public static void main(String[] args) {
		Student s1=new Student(22,"tharun",22);
		Student s2=new Student(23,"vivek",23);
		Student s3=new Student(24,"kasi",24);
		
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext()){
			Student s=(Student)it.next();
			System.out.println(s.age+"--"+s.name+"--"+s.rollno);
		}
		
	}

}
