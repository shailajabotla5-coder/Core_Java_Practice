package Arrays_exp;

import java.util.Scanner;

public class available_from_array {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,-5,6,7,-7,8,21,22,25};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements to search:");
		int key=sc.nextInt();
		boolean status=false;
		for(int n:numbers) {
			if(n==key) {
				status=true;
				System.out.println("the given element found from an array:");
				break;
			}
		}if(!status) {
			System.out.println("the given element not  found from an array:");
		
		}
	}

}
