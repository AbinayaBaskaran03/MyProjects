package com.java.demo;
public class ArrayMultiloop1 {
public static void main(String[] args) {
	
//break and continue the array elements
String names[][]={ {"abi","indhu","kalai"},{"ranji","rag","swetha"},{"swarna","karthi"},{"ayesha","hari"}};
  for(int i = 0;i<names.length;i++) {
	  for(int j = 0;j<names[i].length;j++) {
		  if(i==1) {
			 i++;
			  break;
		  }
		  if(i==1) {
			  i++;
			  continue;
		  }
		  System.out.println("frnd name:"+names[i][j]);
		  } 
	  }
  }
}

