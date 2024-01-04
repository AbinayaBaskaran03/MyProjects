package com.java.demo;
import java.util.Scanner;
public class Revtrial {
	public static void main(String args[]){ 
		Scanner value = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = value.nextLine();
		System.out.println("rev name:");
		StringBuffer rev=new StringBuffer(name);  
		rev.reverse();  
		System.out.println(rev); 
		value.close();
		}  
		}  

