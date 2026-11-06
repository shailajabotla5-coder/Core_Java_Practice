package com_java_languagefundamentals;

class student_constructor {
 static int s;
{
	s++;
}
	
public static void main(String[] args) {
	student_constructor s1=new student_constructor();
	student_constructor s2=new student_constructor();
	student_constructor s3=new student_constructor();
	student_constructor s4=new student_constructor();
	
	System.out.println(s);
		

	}

}
