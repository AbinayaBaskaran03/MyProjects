package com.java.demo.Tasks;
import java.util.Scanner;
public class AscendArrayScanner {
	public static void main(String[] args) {
		 
		Scanner value = new Scanner(System.in);
		System.out.println("Enter size of number:");
		int number = value.nextInt();
		
		int[] num =new int[number];
		int type;
		System.out.print("Enter given numbers:"+" ");
		for(int i = 0;i<number;i++) {
			num[i] = value.nextInt();
		}	
		
		for(int i = 0;i<number;i++) {
			for(int j = i+1;j<number;j++) {
				if(num[i] > num[j]) {
				    type = num[i];
					num[i] = num[j];
					num[j] = type;
				}
			}
		}
		System.out.println("Numbers in Ascending order:");
		for(int i = 0;i<number;i++) {
			System.out.print(num[i]+" ");
		}
		value.close();
	}
}
