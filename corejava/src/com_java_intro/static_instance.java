package com_java_intro;

public class static_instance {
static void method1()
{
	System.out.println("static method 1");
	method2();
}
static void method2()
{
	
System.out.println("static method 2");	
static_instance s1=new static_instance();
s1.method3();
}
void method3()
{
	System.out.println("instance method 1");
	method4();
}
void method4()
{
	System.out.println("instance method 2");
}

public static void main(String[] args) {
	method1();	
	}

}
