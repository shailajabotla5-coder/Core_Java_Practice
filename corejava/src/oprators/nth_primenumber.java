package oprators;

import java.util.Scanner;

public class nth_primenumber {

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

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the nth number:");
        int n = sc.nextInt();

        int count = 0;
        int i = 1;

        while (count < n) {

            if (isprime(i)) {
                count++;
            }

            i++;
        }

        System.out.println(n + "th prime number is: " + (i - 1));

        
    }
}