package com_java_languagefundamentals;

import java.util.Scanner;

public class matrimony {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		String name=sc.nextLine();
		
		System.out.println("nice to meet you MR."+name);
		
		System.out.println("enter your assets:");
		double assets=sc.nextDouble();
		
      if(assets>4000000.00) {
    	  
    	    System.out.println("oh my god its very happy  to listen !!");
    	    
    	    
    	    System.out.println("enter your salary:");
    	    double salary=sc.nextDouble();
    	     
    	    if(salary> 1500000.00)
    	    {
    	    	System.out.println("Wow its good to hear let's continue!!");
    	    	
    	    	System.out.println("Enter your age:");
    	    	int age=sc.nextInt();
    	    	 if(age>=25 && age<=30) {
    	    		 System.out.println("oh nice!! good to go");
    	    		 
    	    		 System.out.println("enter your height and weight!!");
    	    		 float height=sc.nextFloat();
    	    		 float weight=sc.nextFloat();
    	    		 
    	    		 if((height >=5.5f && height<=6.0) && (weight>=50.00 && weight<=80)){
    	    			 System.out.println("okay !! continue with next process....");
    	    			 
    	    			 System.out.println("do you have siblings!!:");
    	    			 boolean  status =sc.nextBoolean();
    	    			   if(status) {
    	    				   System.out.println(" nice!!!  finally you are selected .....!!!!");
    	    			   }
    	    			   else {
    	    				   System.out.println("thank god!!");
  
    	    			 }
    	    		 }
    	    		 else {
    	    			 System.out.println(" sorry you may concentrate on your health!!");
    	    		 
    	    	 }
    	    	  
    	    		   		
    	    		 
    	    	 }
    	    	 else {
    	    		 System.out.println("sorry!!  your age is not matching our profile");
    	    	 }
    	    	
    	    	
    	    }
    	    else {
    	    	  System.out.println("sorry hope for the best");
    	    }
    	  
    	  
    	  
      }
	}

}