package com_java_languagefundamentals;

class  student2_constructor_exp{

    String name;
    int age;

    // 1. Default constructor
    student2_constructor_exp() {
        System.out.println("Default constructor called");
    }

    // 2. One-argument constructor
    student2_constructor_exp(String name) {
        this.name = name;
        System.out.println("One-argument constructor called");
        System.out.println("Name: " + name);
    }

    // 3. Parameterized constructor
    student2_constructor_exp(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Calling default constructor
    	student2_constructor_exp s1 = new student2_constructor_exp();

        // Calling one-argument constructor
    	student2_constructor_exp s2 = new student2_constructor_exp("Shailaja");

        // Calling parameterized constructor
    	student2_constructor_exp s3 = new student2_constructor_exp("Shailaja", 22);
    }
}