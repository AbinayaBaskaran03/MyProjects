package com.java.demo.Tasks;

public class ReversePyramid {
	
	public static void main(String[] args) {
		
		int rows = 5;
		
		for(int i = 0 ; i<=rows-1;i++) {
			//    System.out.print("");
			for(int j = 0 ; j<=i;j++) {
				System.out.print(" ");
			}
			for(int k = 0 ;k<=rows-1-i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
