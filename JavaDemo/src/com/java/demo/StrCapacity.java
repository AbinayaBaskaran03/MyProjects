package com.java.demo;

public class StrCapacity {
	public static void main(String[] args) {
		StringBuffer text = new StringBuffer("name");
		System.out.println(text.capacity());
		text.append("Abinayabaskaran");
		System.out.println(text.capacity());
		text.append("i luv my indhuma");
		System.out.println(text.capacity());
	}

}