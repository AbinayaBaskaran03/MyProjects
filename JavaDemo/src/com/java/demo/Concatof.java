package com.java.demo;
public class Concatof {
 public static void main(String[] args) {
	String s1 = "message";
	String s2 = "has";
	String s3 = "sent";
//concat()
    String s = s1.concat(s2);
//concat wid many strs
	String t = s1.concat(s2).concat(s3);
//concat wid space
	String u = s1.concat(" ").concat(s2).concat(" ").concat(s3);
//add sentence wid concat(before)
	String v = "The".concat(" ").concat(s1);
	System.out.println(s);
	System.out.println(t);
	System.out.println(u);
	System.out.println(v);
}
}
