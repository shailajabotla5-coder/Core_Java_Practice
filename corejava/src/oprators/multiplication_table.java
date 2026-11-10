package oprators;

import java.util.Scanner;

public class multiplication_table {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a multiplication no:");
		int n=sc.nextInt();
		System.out.println("main method ended");
		
	
		for(int i=1;i<=10;i++)
		{
		System.out.println(n+"x"+i+"="+(n*i));
		}
				
	}

}
