package com.java.demo;

public class Ifexamples {

	public static void main(String[] args) {
	    int x = 12;
		int y = 30;
//if
		if( x < y) {
			System.out.println("x is equal to y");
		}
		System.out.println("---------------------");
//if-else		
		if( x > y) {
			System.out.println("statement is  wrong");	
		}
		else {
			System.out.println("statement is correct");
		}
		System.out.println("---------------------");
//else-if		
		int a = 34;
		
		if( a == 40 ) {
			System.out.println("true");
			}
		else if ( a < 50) {
			System.out.println("false");
		}
		else {
			System.out.println("default");
		}	
		System.out.println("----------------------");
		
}
}
