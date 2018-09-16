package com.example.example.interfac;
import java.util.*;  
	enum ss {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  
	public class EnumSetExample1 
{  
	  public static void main(String[] args) {  
	    Set<ss> set1 = EnumSet.allOf(ss.class);  
	      System.out.println("Week Days:"+set1);  
	      Set<ss> set2 = EnumSet.noneOf(ss.class);  
      System.out.println("Week Days:"+set2);     
	  }  
	}  
