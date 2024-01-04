package com.java.demo.Tasks;
import java.util.Scanner;
public class TaskReverse {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = value.nextLine();
		StringBuffer reversename = new StringBuffer(name).reverse();
		System.out.println("Name in reverse:"+reversename);
		value.close();
		}
}
