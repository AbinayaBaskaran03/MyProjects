package com.java.demo;
import java.util.Scanner;
public class Chatgpt {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Collect big word from user through Scanner 
		System.out.print("Enter a big word: "); 
		String bigWord = scanner.next(); 
	

		// Identify how many unique characters are there in the given word 

		int uniqueChars = countUniqueChars(bigWord); 
		System.out.println("Number of unique characters: " + uniqueChars); // Print each character and number of occurrences
		System.out.println("Character\tOccurrences"); 
		for (int i = 0; i < bigWord.length(); i++) { 
		char c = bigWord.charAt(i); 
		int count = countOccurrences(bigWord,c); 
		if (count > 0) { 
		System.out.println(c + "\t\t" + count); 
		bigWord = bigWord.replace("" + c, ""); // Remove all occurrences of the character 
		i--; // Decrement i to account for the removed character 
		} } 

		// Print the entire word in reverse order 
		System.out.print("Word in reverse order: "); 
		for (int i = bigWord.length(); i >0; --i) { 
		System.out.print(bigWord.charAt(i-1));

		 } 
		 // Split the word into two halves 
		
		int midIndex = bigWord.length() / 2; 
		String firstHalf = bigWord.substring(0, midIndex); 
		String secondHalf = bigWord.substring(midIndex); 
		System.out.println("First half: " + firstHalf); 
		System.out.println("Second half: " + secondHalf); 
		} 



		// Count the number of unique characters in a string 

		private static int countUniqueChars(String str) { 
		int count = 0; 
		for (int i = 0; i < str.length(); i++) { 
		char c = str.charAt(i); if (str.indexOf(c) == i) { count++; } } 
		return count; } 
		// Count the number of occurrences of a character in a string 
		private static int countOccurrences(String str, char c) { 
		int count = 0; 
		for (int i = 0; i < str.length(); i++) { 
		if (str.charAt(i) == c) { 
		count++; 
		} 
		} 
		return count; 
	
		}
}

   