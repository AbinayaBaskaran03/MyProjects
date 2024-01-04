package com.java.demo.Tasks;
public class Task4AscendArray {
	public static void main(String[] args) {
		
		int[] number = {5,8,1,4,0,3};
		int value = 0;
		System.out.println("Given numbers:");
		for(int i = 0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
		
		for(int i = 0;i<number.length;i++) {
			for(int j = i+1;j<number.length;j++) {
				if(number[i]>number[j]) {
					value = number[i];
					number[i] = number[j];
					number[j] = value;
				}
			}
		}
		System.out.println();
		System.out.println("number in Ascending orer:");
		for(int i = 0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}

	}

}
