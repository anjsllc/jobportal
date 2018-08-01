package com.example.example.stream;

public class LinkedListEx1 {

	Node one;
	
	static class Node{
		int i;
		Node next;
		Node(int i){
			this.i=i;
			next=null;
		}	
	}
	public static void main(String[] args) {
		LinkedListEx1 ll=new LinkedListEx1();
		new Node(5);
		ll.one=new Node(5);
		Node two=new Node(7);
		Node three=new Node(4);
		
		ll.one.next=two;
		two.next=three;
		
		// print values in node
		
		Node n=ll.one;
		while(n!=null){
			System.out.println(n.i+"\t"+n);
			n=n.next;
		}
		
		//deleting 2nd node
		ll.one.next=three;
		System.out.println("after deletion of second node");
		
		Node n1=ll.one;
		while(n1!=null){
			System.out.println(n1.i+"\t"+n1);
			n1=n1.next;
		}
	}
}
