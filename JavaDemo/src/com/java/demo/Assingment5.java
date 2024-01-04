package com.java.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Assingment5 {
	public static void main(String[] args) {

		Scanner value = new Scanner(System.in);

		System.out.println("Enter start num:");
		int a = value.nextInt();

		System.out.println("Enter End num:");
		int b = value.nextInt();
		
        System.out.println("Numbers in main list:");
         
		ArrayList<Integer> i = new ArrayList<Integer>();
       
        for(int x = a;x<=b;x++) {
		i.add(x);
        }
        System.out.println(i);
        
        ArrayList<Integer> oddnum = new  ArrayList<Integer>();
        ArrayList<Integer> evennum = new  ArrayList<Integer>();

        for(Integer y: i) {
        	if(y % 2==0) {
        		evennum.add(y);
        	}
        	else{
        		oddnum.add(y);
        	}
        	}

    		System.out.println("Even num list:");
    		System.out.print(evennum);
    		System.out.println();
    		System.out.println("Odd num list:");
    		System.out.print(oddnum);

      value.close();
	}

}


