package com.example.example.stream;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
	String s="my name is tharun";
	int l=s.length();
	String r="";
	System.out.println(s);
	
	for(int i=l-1;i>=0;i--){
		r=r+s.charAt(i);
	}
	System.out.println(r);
	}
}
