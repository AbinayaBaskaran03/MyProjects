package com.java.demo;
import java.util.Scanner;
public class Assingment2 {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter Name,gender,a,b");
	String Name = value.nextLine();
	char gender =value.next().charAt(0);
	int a = value.nextInt();
	double b = value.nextDouble();
	System.out.println("Name:"+Name);    
	System.out.println("Gender:"+gender);
	System.out.println("A:"+a);
	System.out.println("B:"+b);
	value.close();
	}
}
