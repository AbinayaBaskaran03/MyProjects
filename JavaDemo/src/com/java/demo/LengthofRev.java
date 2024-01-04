package com.java.demo;
public class LengthofRev {
	public static void main(String[] args) {
		String name = "AbinayaBaskaran";
		int s = name.length();
		for(int i = 0; i<s;i++) {
		System.out.print(name.charAt(name.length()-i-1));
		}
	}
}
