package com.java.demo;
public class Switchexample {
	public static void main(String[] args) {	
	int mark=70;

  switch(mark) {
	case (90) :
	//	(mark>=90) 
		System.out.println("first division");
        break;
	case (80):
	//	(mark>=70)  
	    System.out.println("second division");
		break;
	case (70):
		//(mark>=50) 
	    System.out.println("third division");
	    break;
	default:
		System.out.println("fail");
		break;   	
		}
	}
	}

