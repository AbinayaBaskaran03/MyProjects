package com.java.demo;
import java.util.Scanner;
public class CharAtOddEvenREV {
  public static void main(String[] args) {
	  Scanner value = new Scanner(System.in);
	  System.out.println("Enter String:");
	  String word = value.nextLine();
	StringBuffer text = new StringBuffer(word).reverse();
	for(int i = 0;i <= text.length()-1;i++) {
		if(i%2==0) {
			System.out.println("ch at Even"+" "+i+" "+"is"+" "+text.charAt(i));
		}
		if(i%2!=0) {
			System.out.println("ch at Odd"+" "+i+" "+"is"+" "+text.charAt(i));
		}
	}
	System.out.println(text);
	value.close();
}
}
