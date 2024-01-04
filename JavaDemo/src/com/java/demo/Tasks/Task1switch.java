package com.java.demo.Tasks;
import java.util.Scanner;
public class Task1switch {
    public static void main(String[] args) { 	
    	Scanner value = new Scanner(System.in);
    	System.out.println("Enter Mark1:");
    int mark1 = value.nextInt();
    	System.out.println("Enter Mark2:");
    int mark2 = value.nextInt();
    	System.out.println("Enter Mark3:");
    int mark3 = value.nextInt();
        System.out.println("Enter Mark4:");
    int mark4 = value.nextInt();
    	
   switch(mark1){
	case(90):
	     System.out.println(mark1+":First class");
	     break;
	case(80):
		System.out.println(mark1+":Second class");
	    break;
	case(60):
		System.out.println(mark1+":Third class");
	    break;
	default:
		System.out.println(":Fail");
		 break;	
	}
   switch(mark2){
	case(90):
	     System.out.println(mark2+":First class");
	     break;
	case(80):
		System.out.println(mark2+":Second class");
	    break;
	case(60):
		System.out.println(mark2+":Third class");
	    break;
	default:
		System.out.println(mark2+":Fail");
		 break;	
	}
   switch(mark3){
	case(90):
	     System.out.println(mark3+":First class");
	     break;
	case(80):
		System.out.println(mark3+":Second class");
	    break;
	case(60):
		System.out.println(mark3+":Third class");
	    break;
	default:
		System.out.println(mark3+":Fail");
		 break;	
	}
   switch(mark4){
  	case(90):
  	     System.out.println(mark4+":First class");
  	     break;
  	case(80):
  		System.out.println(mark4+":Second class");
  	    break;
  	case(60):
  		System.out.println(mark4+":Third class");
  	    break;
  	default:
  		System.out.println(mark4+":Fail");
  		 break;	
  	}
   value.close();
	}
}
