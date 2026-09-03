package com_java_intro;

public class Bank_account {
	
	//instance variables
	
int accountno;
String accountholdername;
int balance;

//static variables
static  int  accountnumbergenerater=1000;

// instance initializer
{
accountnumbergenerater++;

accountno=accountnumbergenerater;
}

public static void main(String[] args) {
	Bank_account  b1=new Bank_account ();
	Bank_account  b2=new Bank_account ();
	Bank_account  b3=new Bank_account ();
	Bank_account  b4=new Bank_account ();
	
	System.out.println(b1.accountno);
	System.out.println(b2.accountno);
	System.out.println(b3. accountno);
	System.out.println(b4. accountno);
	}

}
