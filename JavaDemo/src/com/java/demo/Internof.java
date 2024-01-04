package com.java.demo;
public class Internof {
	public static void main(String[] args) {
		String a1 = "Java";
		String a2 = new String("Java");
		String a3 = "Java";
		String a4 = a1.intern();
		String a5 = a2.intern();
		    System.out.println(a1==a2);
		    System.out.println(a1.equals(a2));
		    System.out.println(a1==a5);
		    System.out.println(a1==a3);
		   System.out.println(a2==a4);
	}
}
