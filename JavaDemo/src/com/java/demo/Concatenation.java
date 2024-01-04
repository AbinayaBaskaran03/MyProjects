package com.java.demo;

public class Concatenation {
	public static void main(String[] args) {
		
	//"+"
     	String a = "Abinaya"+" "+"Baskaran";
		   System.out.println(a);
		   System.out.println("---------------");
	//concat()
	   String s = "Indhra ";
	   String r = "Ramdass";
	   String t = s.concat(r);
	       System.out.println(t);
	       System.out.println("---------------");
    // string with values
	    String b = 89+02+"indhuma"+10+12;
	       System.out.println(b);
	       System.out.println("---------------");
    //stringbuilder
	     StringBuilder a1 = new StringBuilder("Ranjana");
	     StringBuilder a2 = new StringBuilder(" Saravanan");
	     StringBuilder name = a1.append(a2);
	        System.out.println(name);
	        System.out.println("---------------");
	//stringformat() 
	      String b1 = "Tamil";
	      String b2 = "Nadu";
	      String state = String.format("%s%s",b1,b2);
	        System.out.println(state);
	        System.out.println("---------------");
	//stringjoin()method
	      String c1 = "Task";
	      String c2 ="Completed";
	      String statement = String.join(" ",c1,c2);
	         System.out.println(statement);
	}	     
}
