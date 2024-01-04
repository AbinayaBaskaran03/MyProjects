package com.java.demo;
public class LoopMultiArray {
	public static void main(String[] args) {
		int num[][]= {{1,2,5},{4,8,6},{7,9,3},{1,2,3}};
		for(int i =0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				/*if(i==1) {
					i++;
					break;
				}
				if(i==2) {
					i++;
					continue;

				}*/
				System.out.println(num[i][j]);
			}
		}
	}
}

