package operator_statements;

import java.util.Scanner;

public class prime_numbers {

    static boolean isprime(int n) {
    boolean status = true;
    if (n == 0 || n == 1) {
    return false;
        }

    for (int i = 2; i < n; i++) {
    if (n % i == 0) {
    status = false;
    break;
            }
        }

      return status;
    }

    public static void main(String[] args) {

       System.out.println("Main method started");
       Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers want to print:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (isprime(i)) {
                System.out.println(i);
            }
        }

        System.out.println("Main method ended");

        
    }
}