package operator_statements;

import java.util.Scanner;

public class ElectricityBills {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the connections like Domestic/Commercial:");
	String connection=sc.next();
	System.out.println("Enter the units:");
	int units=sc.nextInt();
	int charge=0;
	switch (connection) {
	
	case "Domestic"->{
		if(units<=100 || units>=300)
		{
		charge=2*units;	
		}
		else if(units>300)
			
		{
		
			charge=3*units;
		}
		System.out.println("total charge"+charge);
		}
	case"commercial"->{
		if(units<=100 || units>=300)
		{
			charge=2*units;
		}
		else if(units>300)
			{
			charge=3*units;	
			}
		System.out.println("total charge"+charge);
		}
	default->{
		System.out.println("Invalid Condition");
	}
	}
	
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
		
	


