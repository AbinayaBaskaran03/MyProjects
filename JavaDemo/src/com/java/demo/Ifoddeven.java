package com.java.demo;
import java.util.Scanner;
public class Ifoddeven {
	public static void main(String[] args) {
	
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the many number:");		
	int a = value.nextInt();
	    System.out.println("Enter" +"  "+ "number:");
	    {
	int i;
	for( i = 0; i < a; i++) {
		int b = value.nextInt();   
	if(b%2==0) {
		System.out.println("Even");
	    }
 else{
		System.out.println("odd");
      } 
	}
	  
  }	
	 value.close();
}
}
