package com.java.demo.Tasks;
import java.util.Scanner;
public class DesendArrayScanner {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter size num:");
		int num = value.nextInt();
		
		int[] number = new int[num];
		int val = 0;
		System.out.print("Enter given number:"+" ");
		for(int i = 0;i<num;i++) {
			number[i] = value.nextInt();
		}
		
		for(int i = 0;i<num;i++) {
			for(int j = i+1;j<num;j++) {
				if(number[i] < number[j]) {
					val = number[i];
					number[i] = number[j];
					number[j] = val;
				}
			}
		}
		
		System.out.println("Numbers in Descending order:");
		for(int i = 0;i<num;i++) {
			System.out.print(number[i]+" ");
		}
	}

}
