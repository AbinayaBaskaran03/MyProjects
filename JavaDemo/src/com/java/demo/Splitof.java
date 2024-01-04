package com.java.demo;
public class Splitof {
	public static void main(String[] args) {
		String text = "indhuma is my fvrt person";
		
			//System.out.println(u);
		
			System.out.println("-------------");
			System.out.println("split text is:");
			for(String v:text.split("\\s",0)) {
				System.out.println(v);
			}
			System.out.println("--------------");
			for(String w:text.split("\\s",3)) {
				System.out.println(w);
			}
	}
}
