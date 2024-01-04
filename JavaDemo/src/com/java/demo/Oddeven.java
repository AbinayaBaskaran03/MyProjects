package com.java.demo;
import java.util.Scanner;
public class Oddeven {
	public static void main(String[] args) {
		int i;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter x");
		{
		int x  = value.nextInt();
		for(i=0;i<x;i++) {
			System.out.println(i);	
		if(i%2==0) {
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");	
		}
		}
		}
	value.close();
}
}


