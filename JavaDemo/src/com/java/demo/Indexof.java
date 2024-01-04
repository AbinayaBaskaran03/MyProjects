package com.java.demo;
public class Indexof {
	public static void main(String[] args) {
		String statement = "print the values of variables";
		int v1 = statement.indexOf("va");
		int v2 = statement.indexOf("va",12);
		int v3 = statement.indexOf('s');
		int v4 = statement.indexOf("of",30);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);	
	}
}
