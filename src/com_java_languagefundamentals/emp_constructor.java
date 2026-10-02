package com_java_languagefundamentals;

 class emp_constructor {

	//instance variables
	 String empname="shailu";
	 int id=12;
	 double sal=1000.00;
	 emp_constructor(String empname,int id, double sal) {
		 this.empname=empname;
		 this.id=id;
		 this.sal=sal;
		 
		 }
	
	public static void main(String[] args) {
		
		emp_constructor e=new emp_constructor("potty",13,10000000.0d);
		
		System.out.println("Enter the empname:"+ e.empname);
		System.out.println("Enter the id:"+ e.id);
		System.out.println("Enter the sal:"+ e.sal);
		
	}

}
