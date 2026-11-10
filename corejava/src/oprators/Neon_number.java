package oprators;

import java.util.Scanner;

public class Neon_number {

    public static void main(String[] args) {

        System.out.println("main method started");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int square = n * n;
        int sum = 0;

        while (square > 0) {

            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        if (sum == n) {
            System.out.println("It is a Neon number");
        } else {
            System.out.println("It is not a Neon number");
        }
    }
}