package com.java.demo;
import java.util.StringJoiner;
public class Strjoiner {
	public static void main(String[] args) {
		StringJoiner i = new StringJoiner(" ");
		i.add("THE");
		i.add("END");
		System.out.println(i);
	}
}
