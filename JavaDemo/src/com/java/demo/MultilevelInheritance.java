package com.java.demo;
//grandchild
class Kalai extends Indhuma{
	
//override
	public void fvrtcolour() {
		super.fvrtcolour();
		System.out.println("Kalai:Yellow");
	}
	public void fvrtsub() {
		System.out.println("Kalai:Maths");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		
		Kalai kalaiObj = new Kalai();
		
		kalaiObj.luckynum1();
		
		kalaiObj.fvrtcolour();

		kalaiObj.fvrtfood();

		kalaiObj.fvrtsweet();

		kalaiObj. fvrtsub();

	}

}
