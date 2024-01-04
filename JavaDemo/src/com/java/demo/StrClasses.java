package com.java.demo;

public class StrClasses {
	public static void main(String[] args) {
		
String word = "Mathematics";
//startswith() n endswith()
		System.out.println(word.startsWith("Mat"));
		System.out.println(word.endsWith("cs"));
		System.out.println(word.startsWith("ma"));
		System.out.println(word.endsWith("sd"));
		System.out.println("--------");
//charAt()
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(8));
		System.out.println("--------");
//length()
        System.out.println("length of word:"+word.length());
        System.out.println("--------");
//intern()
String s = word.intern();
        System.out.println(s);
        System.out.println("--------");
//valueof()
 long a = 9751533125l;
 String b = String.valueOf(a);
        System.out.println(b+" "+a);
        System.out.println("--------");
//replace()
 String text = "Ebrain Technology";
 String value = text.replace("e","i");
        System.out.println(value);
}
}
