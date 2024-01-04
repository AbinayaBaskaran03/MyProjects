package com.java.demo;
import java.util.Scanner;
public class Equalscanner {
    public static void main(String[] args) {
    	Scanner value = new Scanner(System.in);
    	System.out.println("string1:");
    	String a = value.nextLine();
    	System.out.println("string2:");
    	String b = value.nextLine();
    	System.out.println("string3:");
    	String c = value.nextLine();
    	
    	System.out.println(a.equals(b));
    	System.out.println("---------");
    	System.out.println(a.compareTo(b));
    	System.out.println(b.compareTo(c));
    	System.out.println(a.compareTo(a));
    	value.close();
    }
}
