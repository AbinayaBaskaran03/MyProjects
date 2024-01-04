package com.java.demo;
public class Array {
	public static void main(String[] args) {
//elements of array		
		String name[] = {"Abi","Indhuma","Kalai"};
		for(int i =0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println("---------");
//change array element
		String bikename[] = {"Rx100","pulsor","RoyalEnfield"};
		bikename[1] = "KTM";
		for(int i = 0;i<bikename.length;i++) {
			System.out.println(bikename[i]);
		}
		System.out.println("---------");
//array length
		System.out.println("lenth of bikename:"+bikename.length);
	}

}
