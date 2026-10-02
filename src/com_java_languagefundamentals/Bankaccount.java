package com_java_languagefundamentals;

public class Bankaccount {
	int accountnumber;
    String accountholdername;
    double balance;
    String branch;
    
    Bankaccount(  int accountnumber,String accountholdername, double balance,String branch)
    {
    this.accountnumber=accountnumber;
    
    this.accountholdername=accountholdername;	
    
    this.balance=balance;
    
    this.branch=branch;
    }
    Bankaccount( int accountnumber,String accountholdername)
    {
    	 this.accountnumber=accountnumber;
    	    
    	    this.accountholdername=accountholdername;	
    	    
    }
    
     void disply()
    {
        System.out.println("enter your accountnumber:"+accountnumber);
        System.out.println("enter your accountholdername:"+accountholdername);
        System.out.println("enter your balance:"+balance);	
        System.out.println("enter your branch:"+branch);	
    }
    	
    public static void main(String[] args) {
    	Bankaccount b1=new Bankaccount(101,"shailaja",10000,"union");	
    	Bankaccount b2=new Bankaccount(102,"shailaja1",10000,"union");	
	}

}
