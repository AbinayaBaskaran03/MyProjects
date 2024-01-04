package com.Oops;
import java.util.Scanner;

public class MultiplicationTable {
//Question-01:
//To write a program to print a Multiplication Table of given number by using Oops Concept in java
		    public static void main(String[] args) 
		    {
		        Scanner s = new Scanner(System.in);

		        System.out.println("Enter a number to print its multiplication table");
		        int number = s.nextInt();
		        for (int i = 1; i <= 10; i++) 
		        {
		            int result = i * number ;
		            System.out.println(i + " * " + number + " = " + result);
		        }
			    s.close();

		    }
		}

