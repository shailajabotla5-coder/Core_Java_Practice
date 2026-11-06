package com_java_languagefundamentals;

public class methods_exp {

	public static void main(String[] args) {
	System.out.println("main method started");
	
	methods_exp m1=new methods_exp();
	m1.addition(50,30);
	m1.substraction(100,50);
	m1.multiplication(50,10);
	m1.division(50,5);
	
	System.out.println("main method ended");
	}
	 public void addition(int a,int b) {
	System.out.println(" addition method called");
	System.out.println(a+b);
	 }
	 public void substraction(int a,int b)
	 {
		 System.out.println(" substration method called");
			System.out.println(a-b);	
	 }
	 public void multiplication(int a,int b)
	 {
		 System.out.println(" multiplication method called");
			System.out.println(a*b);	
	 }
	 public void division(int a,int b)
	 {
		 System.out.println(" division method called");
			System.out.println(a/b);	
	 }
}

