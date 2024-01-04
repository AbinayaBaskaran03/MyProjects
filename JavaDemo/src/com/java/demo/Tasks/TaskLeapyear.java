package com.java.demo.Tasks;
import java.util.Scanner;
public class TaskLeapyear {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = value.nextInt();
		int year1 = value.nextInt();
	if(year%4==0) {
	        System.out.println("year is leapyear:"+year);	
		}
	 else
		{
			System.out.println("year is not leapyear:"+year);	
		}
	if(year1%4==0) {
        System.out.println("year is leapyear:"+year1);	
	}
	else {
        System.out.println("year is not leapyear:"+year1);	
	}
	value.close();
	}
}
