package com.java.demo.Tasks;
import java.util.Scanner;
public class Task2if {
	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		System.out.println("Enter Student mark:");
		int mark = value.nextInt();
		if(mark>=90) {
			System.out.println("Grade:"+"First class");
		}
		else if(mark>60) {
			System.out.println("Grade:"+"Second class");	
		}
		else
		{
			System.out.println("Grade:"+"Fail");
			}
		value.close();
	}
	}
