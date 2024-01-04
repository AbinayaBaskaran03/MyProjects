package com.java.demo;
public class Strensurecapacity {
public static void main(String[] args) {
	StringBuilder a = new StringBuilder();
	System.out.println(a.capacity());
	a.append("Indhra");
	System.out.println(a.capacity());
	a.append("Indhuma is a math queen");
	System.out.println(a.capacity());
	System.out.println("------------");
	a.ensureCapacity(10);
	System.out.println(a.capacity());
	System.out.println("------------");
	a.ensureCapacity(35);
	System.out.println(a.capacity());
}
}
