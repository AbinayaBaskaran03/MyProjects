package com.java.demo;
import java.util.Scanner;
public class ArrayScanner {
	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		System.out.println("Enter size of name:");
		int name =value.nextInt();
		
		String[] bk = new String[name];
		
		System.out.println("Enter names of bikes:");
		
		for(int i = 0; i < name; i++) {
			
			bk[i] = value.nextLine();
			
			System.out.println("Enter bikename" +(i+1)+ ":");
			
			bk[i] = value.nextLine();
		}
		
		System.out.println("The bikenames are:");
		
		for(int i = 0;i < name; i++) {
			System.out.print(" "+bk[i]);
		}
		
		value.close();
	}
}
