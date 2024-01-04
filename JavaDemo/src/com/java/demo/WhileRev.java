package com.java.demo;
import java.util.Scanner;
public class WhileRev {
	public static void main(String[] args) {
		String a;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter word:");
		a = value.nextLine();
		int i = a.length();
		while(i>0) {
			System.out.print(a.charAt(i-1));
			--i;
		}
		value.close();
	}
}
