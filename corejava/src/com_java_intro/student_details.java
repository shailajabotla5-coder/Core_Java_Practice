package com_java_intro;

public class student_details {
	static int count=0;
	
	static{
	System.out.println("static block executed");
	}
	{
	System.out.println("instance  block executed");
	
	count++;
	
	}
	
	public static void main(String[] args) {
		
		student_details s1=new student_details();
		student_details s2=new student_details();
		student_details s3=new student_details();
		
		System.out.println("no of  objects created:"+count);
		
	}

}
