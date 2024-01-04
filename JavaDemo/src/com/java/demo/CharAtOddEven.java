package com.java.demo;
public class CharAtOddEven {
	public static void main(String[] args) {
		String text ="Nothing";
    for(int i = 0;i <= text.length()-1;i++) {
		if(i%2!=0) {
		    System.out.println("ch at odd"+" "+i+" "+"is"+" "+text.charAt(i));
		}
		if(i%2==0) {
			System.out.println("ch at even"+" "+i+" "+"is"+" "+text.charAt(i));
		}
    }
            System.out.println("-----------------");
	}
	}
            
//charat() oddeven in reverse order:
            
 /*  StringBuffer word = new StringBuffer("Nothing");
   word = word.reverse();
   for(int i = 0;i <= text.length()-1;i++) {
		if(i%2!=0) {
		    System.out.println("ch at odd"+" "+i+" "+"is"+" "+text.charAt(i));
		}
		if(i%2==0) {
			System.out.println("ch at even"+" "+i+" "+"is"+" "+text.charAt(i));
		}
   }
            } */


