package com.java.demo;
public class JavaArray {
	public static void main(String[] args) {
		int value[] = new int[6];
		value[1] = 10;
		value[2] = 12;
		value[3] = 89;
		value[4] = 02;
		value[5] = 05;
		for(int i = 1;i<value.length;i++) {
			System.out.println(value[i]);
		}

	}

}
