package com.java.demo;

public class Stringbuffer {
	public static void main(String[] args) {
//append()
		StringBuffer name =new StringBuffer("Indhra");
		name.append("Ramadass");
		System.out.println(name);
		System.out.println("------------");
//insert()	
		StringBuffer word = new StringBuffer("black");
		word.insert(4,"love");
		System.out.println(word);
		System.out.println("------------");
//replace()
		StringBuffer value = new StringBuffer("maths");
		value.replace(1,4,"love");
		System.out.println(value);
		System.out.println("------------");
//delete()	
		StringBuffer a = new StringBuffer("blue");
		a.delete(1,3);
		System.out.println(a);
	}

}
