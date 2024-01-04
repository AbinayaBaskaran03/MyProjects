package com.Oops;
import java.util.Scanner;

public class SumClass1 {
//Question_02:
//To calculate the Sum of Two Numbers by using the two classes that are Class Sample and Class Sum.

	Scanner sc=new Scanner(System.in);
	int a;
	int b;
	int c;
	void Getinput()
	{
		System.out.println("Enter 1st Number:");
		a=sc.nextInt();
		System.out.println("Enter 2nd Number:");

		b=sc.nextInt();
	}
	void DisplaySum()
	{
		c=a+b;
		System.out.println("Result: "+c);
	}
	}
