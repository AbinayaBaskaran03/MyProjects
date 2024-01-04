package com.java.demo;
import java.util.Scanner;
public class Whilestop {
	public static void main(String[] args) {	
		Scanner value = new Scanner(System.in);	
		 System.out.println("Enter stringname:");
	     String b="";
	   while (!b.equals("stop")) {
		     b=value.nextLine();
	   }
		   System.out.println(" stop ");
		value.close();
	}
}
