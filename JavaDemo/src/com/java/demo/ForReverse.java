package com.java.demo;
import java.util.Scanner;
public class ForReverse {
	public static void main(String[] args) {
		String word;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter word:");
	    word = value.nextLine();
	    System.out.println("word in rev:");
		for(int i=word.length();i>0;--i) {
		System.out.print(word.charAt(i-1));
		}
		value.close();
	}
}
