package com.java.demo;
import java.util.Scanner;
public class BreakContinue {
 public static void main(String[] args) {
	Scanner value = new Scanner(System.in);
	System.out.println("enter number:");
	int a = value.nextInt();
	int i = 0;
	do
	{
		System.out.println(i);
		i++;
		if(i==5) {
			break;
		}	
	}
	while(i<=a);
	int j = 5;
	do {
		j++;
			continue;
	}
	while(j<=a);
	System.out.println(j);	
	value.close();
 }
}
