package com.java.demo;
import java.util.Scanner;
public class While {
public static void main(String[] args) {	
		int i = 0;
		Scanner Value = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = Value.nextInt();
		
		while(i<=a) {
			if(i==8) {
				i++;
				continue;		
			}
			System.out.println(i);
			
			i++;
			}	
		Value.close();
		}
	}


