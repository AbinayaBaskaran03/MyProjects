package com.java.demo;
import java.util.Scanner;

public class Assingment4 {
public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		
		System.out.println("Enter a:");
		int number = value.nextInt();
		System.out.println("Enter b:");
		int number1 = value.nextInt();
		
		int[] x = {number,number1};
	    System.out.println("The numbers are:");
	    System.out.print("  "+"[");

		for(int i = number;i<=number1;i++) {
			System.out.print(i+" ");
		}
		System.out.print("]");

//	min and max	
			int max = x[0];
			int min = x[0];

			for(int i=0;i<x.length;i++) {
		    	value.nextLine();	
		    	
				if(x[i] > max) {
					max = x[i];
				}	
				if(x[i]< min) {
					min = x[i];
				}
			}
			System.out.println("The maximum num:"+max);
	    	System.out.println("The minimum num:"+min);	
	    	
//odd even	  
	    	
	    	for(int i= number;i<=number1;i++) {
	    		if(i%2==0) {
	    			System.out.println(i+":Even");
	    		}
	    		if(i%2!=0) {
	    			System.out.println(i+":Odd");
	    		}
	    	}
		value.close();
	}
	}


