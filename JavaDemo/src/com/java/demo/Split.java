package com.java.demo;
import java.util.Arrays;
public class Split {

	public static void main(String[] args) {
		String a =  "I love Indhuma";
		String[] result = a.split("\\s");
		System.out.println(Arrays.toString(result));	
	}
}