package com.java.demo.Tasks;
import java.util.Scanner;
public class TaskULcase {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter name:");
		String a = value.nextLine();
		System.out.println("name in uppercase:"+a.toUpperCase());
		String b = value.nextLine();
		System.out.println("name in lowercase:"+a.toLowerCase());
		String c = value.nextLine();
		System.out.println("Name:"+a.replace("ABINAYA","Abinaya"));
		String d = value.nextLine();
		value.close();
	}
}
