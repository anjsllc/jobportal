package com.example.example.hackerrank;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=3;
		int c=0;
		int range=100;
		String s="";
		
	
		for(int i=2; i<=n; i++){
			if(n % i==0 ){
				c++;
			}
			
		}
		System.out.println(c);
		if(c > 1){
			System.out.println("this is not  prime number");
		}else{
			System.out.println("this is prime number");
		}
	}

}
