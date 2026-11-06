package com_java_languagefundamentals;

  public class student_constructors_exp {
	  int stdid  ;
		 String name;
		 String loc;

	  student_constructors_exp(){
		  stdid  =101 ;
		  name = "shailaja";
		 loc="jangaon";
		 System.out.println("constructor called");
		 System.out.println("STID:"+stdid);
		 System.out.println("Name:"+name);
		 System.out.println("LOC:"+loc);
	  }

public static void main(String[] args) {
	 student_constructors_exp s1=new  student_constructors_exp();
	 
		
			}

}
