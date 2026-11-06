package com_java_languagefundamentals;

public class banking_constructor_exp {
       int accountnumber;
       String accounttype;
       double balance;
       banking_constructor_exp(  int accountnumber,String accounttype, double balance)
       {
       this.accountnumber=accountnumber;
       
       this.accounttype=accounttype;	
       this.balance=balance;
       }
       void disply()
       {
       System.out.println("enter your accountnumber:"+accountnumber);
       System.out.println("enter your accounttype:"+accounttype);
       System.out.println("enter your balance:"+balance);
       }
      
       
	
	public static void main(String[] args) {
		banking_constructor_exp  b1=new banking_constructor_exp (105,"union",1000000.0987);
		b1.disply();
		banking_constructor_exp  b2=new banking_constructor_exp (104,"sbi",20000000.0987);
		b2.disply();
	}

	}


