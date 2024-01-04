package com.java.demo;
//parent class
class Abinaya{
	
int luckynum1 = 3;
	public void fvrtcolour() {
		System.out.println("Abi:Blue");
	}
	public void fvrtfood() {
		System.out.println("Abi:Briyani");
	}
	public void fvrtsweet() {
		System.out.println("palkova");
	}
}
//child class
class Indhuma extends Abinaya{
       public void luckynum1() {
	System.out.println("12");
}
//override
	   public void fvrtcolour() {
		   super.fvrtcolour();
		   System.out.println("Indhuma:Red");
	   }
	   public void fvrtfood() {
		   super.fvrtfood();
		   System.out.println("Indhuma:Curd rice");
	   }
   }

public class SingleInheritance {
	public static void main(String[] args) {
		
		Indhuma indhuObj = new Indhuma();
		
		indhuObj.luckynum1();
		
		indhuObj.fvrtcolour();
		
		indhuObj.fvrtfood();
		
		indhuObj.fvrtsweet();
	}
}
