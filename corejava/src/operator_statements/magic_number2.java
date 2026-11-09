package operator_statements;

import java.util.Scanner;

public class magic_number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a mumber");
		int n=sc.nextInt();
		while(n>0) {
			n=n%10;
			int rem=n%10;
			while(n>0) {
				n=n/10;
			}
		}
	}
	

}
