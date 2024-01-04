package com.java.demo;
public class Emptyof {
	public static void main(String[] args) {
		String a = "";   //if the space given value can be taken(not an empty string)
		String b = "Abinaya";
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		System.out.println("---------");
		
		if(a.length()==0 || a.isEmpty()) {
			System.out.println("a is Empty");
		}else
		{
			System.out.println("a is not empty");
		}
		if(b.length()==7 || b.isEmpty()) {
			System.out.println("b is not empty");
		}else
		{
			System.out.println(b);
		}
		if(b.length()==0 || b.isEmpty()) {
			System.out.println("b is empty");
		}else
		{
			System.out.println(b);
		}
	}
}
