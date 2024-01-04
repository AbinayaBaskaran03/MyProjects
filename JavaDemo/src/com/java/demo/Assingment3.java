package com.java.demo;
import java.util.Scanner;
public class Assingment3 {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter bigword:");
		String bigword = value.nextLine();
		
//bigword in reverse order
				System.out.println("bigword in reverse order:");
			    for(int i =bigword.length();i>0;--i) {
			    System.out.print(bigword.charAt(i-1));
			}
//split the bigword into two half
				String word = value.nextLine();
			    int midvalue = bigword.length()/2;
				String firsthalf = bigword.substring(0,midvalue);
				String secondhalf = bigword.substring(midvalue);
				System.out.println("Firstpart:"+firsthalf);
				System.out.println("Secondpart:"+secondhalf);
			
		int uniqueChars = countUniqueCharacters(bigword);
		    System.out.println("Number of uniquechars:"+uniqueChars);
		    System.out.println("Characters\tOccurences");
		for(int i=0;i<bigword.length();i++) {
		char a =bigword.charAt(i);
		int count = countOccurences(bigword,a);
		if(count > 0) {
			System.out.println(a+ "\t\t"+ count);
			bigword = bigword.replace(""+a,"");
			i--;
			}
		}
		
		value.close();
		}
		private static int countUniqueCharacters(String bigword) {
			int count = 0;
			for(int i = 0;i<bigword.length();i++) {
				char b = bigword.charAt(i);
				if(bigword.indexOf(b)==i) {
					count++;}}
			return count;
		}
		private static int countOccurences(String bigword,char b) {
			int count = 0;
			for(int i = 0;i<bigword.length();i++) {
				if(bigword.charAt(i)==b) {
					count++;}}
			return count;
		}
}
	
	


