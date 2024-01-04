package com.java.demo;
import java.util.Scanner;
public class CharAt {
	    public static void main(String[] args) {
	    	Scanner value = new Scanner(System.in);
	    	System.out.println("Enter word:");
	      String word =value.nextLine();  
	        String name = "";
	       int i=word.length();
	       for (int count=0; count<name.length(); count++) { 
	          if(name.charAt(count)!=' ') { 
	       count++;
	        }
	        }
	        System.out.println("No of characters:"+i);
	        value .close();
	 }  
}
