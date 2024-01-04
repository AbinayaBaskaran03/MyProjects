package com.java.demo.Tasks;
import java.util.Scanner;
public class TaskArrayOddEven {
	public static void main(String[] args) {
		
	      Scanner value = new Scanner(System.in);
	      System.out.println("Enter size of num:");
	      int num = value.nextInt();
	      
	      int[] number = new int[num];
	      System.out.println("Enter num:");

	      for(int i = 0;i<num;i++) {
		      number[i] = value.nextInt();
	      }
	      int large = number[0];
	      int small = number[0];
//	find a largest and smallest number  
	  
	      for(int i = 1;i<num;i++) {
	    	  
	    	 if(number[i] > large) {
	    		 large = number[i];
	    	 }
	    	  if(number[i] < small) {
	    		  small = number[i];
	    	  }
	      }
   	      System.out.println("The largest num is:" + large);
		  System.out.println("The smallest num is:"+small);

//odd even in array	      
	     for(int i = 0;i<=number.length-1;i++) {
	    	  if(i%2!=0) {
	    		  System.out.println(number[i]+":Odd num");
	    	  }
	    	  if(i%2==0) {
	    		  System.out.println(number[i]+":Even num");
	    	  }
	      }
	      value.close();
	}
}
