package com.java.demo;
public class LastIndexof {
	public static void main(String[] args) {
		String value = "string values in index";
		System.out.println(value.lastIndexOf('s'));
		System.out.println(value.lastIndexOf('s',12));
		System.out.println(value.lastIndexOf("in"));
		System.out.println(value.lastIndexOf("in",15));
		System.out.println(value.lastIndexOf(" "));
	}

}
