package com.java.demo;
import java.util.Scanner;
public class Nextscanner {
      public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter name:");
		String a = value.next();
		System.out.println("Name:"+a);
		value.close();
	}	
}
	
	
