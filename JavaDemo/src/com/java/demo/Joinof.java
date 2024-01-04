package com.java.demo;
import java.util.StringJoiner;
public class Joinof {
 public static void main(String[] args) {
//stringjoiner
	 StringJoiner a = new StringJoiner("-");
	 a.add("Student");
	 a.add("Detail:");
	 System.out.println(a);
	 System.out.println("**********************");
//string join()
	String word = String.join("/","10","05","2002");
	String Fname = String.join(" ","Baskaran","Saravanan","Ramaiyan");
	String text = String.join("-","FMS","school");
	String name = String.join(",",null,"Abi","Ranji","Ragavi");
	System.out.println("DOB:"+word);
	System.out.println("schl:"+text);
	System.out.println("name:"+name);
	System.out.println("Fathers name:"+Fname);
	
}
}
