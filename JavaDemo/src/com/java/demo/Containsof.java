package com.java.demo;

public class Containsof {
     public static void main(String[] args) {
		String value = "An unexpected person became my fvrt person";
		System.out.println(value.contains("fvrt"));
		System.out.println(value.contains("like"));
		System.out.println("--------");

		String Indhuma ="late night chat with fvrt person";
		if(Indhuma.contains("fvrt"))
		{
			System.out.println("indhuma is my fvrt person");
		}
		else
		{
			System.out.println("not an fvrt person");
		}
		
	}
}
