package com.java.demo.Tasks;
import java.util.Scanner;
public class Task3Rev {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		{
	char a;
	String b,reverse = "";
	     System.out.println("Enter Word:");
	     b = value.nextLine();
	     System.out.println("word in reverse order:");
	     int i;
	     for(i=0;i<b.length();i++) { 
	    	a = b.charAt(i);
	    	reverse = a+reverse;
	    	
	     }
	     System.out.println(reverse);
	  value.close();
	}
}
}

