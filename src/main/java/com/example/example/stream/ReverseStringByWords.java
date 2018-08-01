package com.example.example.stream;

public class ReverseStringByWords {
	public static void main(String[] args) {
		String s="heyu user only one the user";
		String[] arr=s.split(" ");
		String st3="";
		int l=arr.length;
		System.out.println(s);
		for(int i=0;i<l;i++){
			String s1=arr[i];
			//System.out.println(s1);
			int a=s1.length();
			
			for(int j=a-1;j>=0;j--){
				st3=st3+s1.charAt(j);
			}
			st3=st3+" ";
			System.out.println(st3);
			
		}
		System.out.println(st3);
		
	}
}
