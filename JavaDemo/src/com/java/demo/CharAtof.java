package com.java.demo;
import java.util.Scanner;
public class CharAtof {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = value.nextLine();
		int a = word.length();
		System.out.println("index of 1st word:"+word.charAt(0));
		System.out.println("index of  word:"+word.charAt(8));
		System.out.println("index of last word:"+word.charAt(a-10));
		value.close();
	}
}
