package operator_statements;

import java.util.Scanner;

public class Reverse_number {

    public static void main(String[] args) {

        System.out.println("main method started");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        
        int n = sc.nextInt();

        int r = 0;
        
        int reverse = 0;

        while (n > 0) {
        	
            r = n % 10;
            
            reverse = reverse * 10 + r;
            
            n = n / 10;
        }
        System.out.println("reverse no: " + reverse);

        
    }
}