package oprators;

import java.util.Scanner;

public class Fibonacci_series {

	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int n=sc.nextInt();
	int a=0;
	int b=1;
	
    for(int i=1;i<=n;i++)
	{
	
	int c =a+b;
	System.out.print(a+" ");
	a=b;
	b=c;
	}
    
	}
}
