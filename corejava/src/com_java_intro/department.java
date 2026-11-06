package com_java_intro;

public class department {

	
		  // Static method 1
	    static void staticMethod1() {
	        System.out.println("Static Method 1 is called");
	    }

	    // Static method 2
	    static void staticMethod2() {
	        System.out.println("Static Method 2 is called");
	    }

	    // Instance method 1
	    void instanceMethod1() {
	        System.out.println("Instance Method 1 is called");
	    }

	    // Instance method 2
	    void instanceMethod2() {
	        System.out.println("Instance Method 2 is called");

	        // Calling all other 3 methods
	        staticMethod1();
	        staticMethod2();
	        instanceMethod1();
	    }

	    public static void main(String[] args) {

	        department d = new department();

	        // Calling only ONE method inside main()
	        d.instanceMethod2();
	    }
	}
		

	


