package com.java.demo;
import java.util.Scanner;
public class Arraygpt {
 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }
	        System.out.println("The elements in the array are:");
	        for (int i = 0; i < size; i++) {
	            System.out.println(array[i]);
	        }
	    }
	}


