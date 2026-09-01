package com_java_intro;

public class student {
	
	//static variables
	static String collegename="cjits" ;
	//instant variables
	String studentname;
	int studentid;
	int studentmarks;
	
	public static void main(String[] args) {
	
		student s1=new student();
		{
			s1.studentname="shailaja";
			s1.studentid = 14;
			s1.studentmarks=100;
			
		System.out.println("collegename:"+collegename);
		System.out.println("studentname:"+s1.studentname);
		System.out.println("studentid:"+ s1.studentid); 
		System.out.println("studentmarks:"+s1.studentmarks);
		}	
	}
}

