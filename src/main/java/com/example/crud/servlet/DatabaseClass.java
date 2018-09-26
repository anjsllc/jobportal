package com.example.crud.servlet;



import java.util.HashMap;
import java.util.Map;


public class DatabaseClass {
	private static Map<Long, Emp> emp=new HashMap<>();


	public static Map<Long, Emp> getEmp(){
		return emp;
	}
	
	
}
