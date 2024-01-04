package com.java.demo.Tasks;
import java.util.Scanner;

public class minmax {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n];

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        System.out.print("Array values: [");
	        for (int i = 0; i < array.length; i++) {
	            if (i != array.length - 1) {
	                System.out.print(array[i] + ", ");
	            } else {
	                System.out.print(array[i]);
	            }
	        }
	        System.out.println("]");
	    }
	}


