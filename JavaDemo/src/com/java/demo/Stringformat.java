package com.java.demo;

public class Stringformat {

	public static void main(String[] args) {
//Stringformat		
		String s1 = "Ranjana";
		String s2 = "Saravanan";
		String s = String.format("%s %s",s1,s2);
		System.out.println(s.toString());
		System.out.println("____________");
//format() specifiers
		String a = String.format("%s","abi");
		String b = String.format("%f",23.6);
		String c = String.format("%x",101);
		String d = String.format("%b",10);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);	
	}
}


