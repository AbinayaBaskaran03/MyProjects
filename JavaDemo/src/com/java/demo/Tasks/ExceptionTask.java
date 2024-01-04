package com.java.demo.Tasks;

public class ExceptionTask {
	public static void main(String[] args) {
		
		try
		{
			int a = 10/0;
		}
		catch(ArithmeticException i)
		{
			System.out.println(i);
		}
		finally {
			System.out.println("Value has a exception");
		}
		System.out.println("Arithmetic");

	}

}
