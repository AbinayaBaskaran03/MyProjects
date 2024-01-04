package com.java.demo;
import java.util.Scanner;
public class Dowhile {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("enter string:");
		int word = value.nextInt();
		
		 int a = 0;	 
		do
		{
			System.out.println(word);	
		  a++;
		  if(a==5) {
			  break;
		  }
		}
		while(a<=10);
		System.out.println(a);
		value.close();
	}
}
