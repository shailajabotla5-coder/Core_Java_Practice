package com_java_intro;

public class student_info {

	class ObjectCount {

	    static int count = 0;

	    // Static block
	    static {
	        System.out.println("Static Block Executed");
	    }

	    // Instance block
	    {
	        count++;
	        System.out.println("Instance Block Executed");
	    }

	    public static void main(String[] args) {

	    	student_info obj1 = new student_info();
	    	student_info obj2 = new student_info();
	    	student_info obj3 = new student_info();

	        System.out.println("Number of objects created: " + count);
	    }

	}
}
	


