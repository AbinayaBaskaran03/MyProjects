package com.java.demo;

public class Equal {
 public static void main(String[] args) {
	
	 String a = "Indhra";
	 String b = "Indhra";
	 String c =new String("Abinaya");
	 String d = new String("Indhra");
	 //equals()
	 System.out.println(a.equals(b));
	 System.out.println(b.equals(c));
	 System.out.println(b.equals(d));
	 System.out.println("------");
	 //==
	 System.out.println(a==b);
	 System.out.println(b==d);//
	 System.out.println("------");
	 //CompareTo()
	 System.out.println(a.compareTo(b));
	 System.out.println(b.compareTo(c));
	 System.out.println(c.compareTo(d));
}
}
