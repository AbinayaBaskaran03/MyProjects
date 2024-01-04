package com.java.demo;
import java.util.Scanner;
public class Reverseorder {
	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);{
		char word;
		String a,b = "";
		System.out.println("Enter name:");
		a = value.nextLine();
		System.out.println("Reverse Order:");
		int i;
		for(i=0;i<=a.length();i++) {
	 word = a.charAt(i);
			b = a+b;	
		}
		System.out.println(b);	
		}
	value.close();	
}
}
