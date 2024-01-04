package com.java.demo;

public class Immutablestring {

	public static void main(String[] args) {
		String a1 = "Indhra";
		a1.concat("Ramdass");
		System.out.println(a1);
		a1 = a1.concat("Ramdass");
		System.out.println(a1);
	}
}
