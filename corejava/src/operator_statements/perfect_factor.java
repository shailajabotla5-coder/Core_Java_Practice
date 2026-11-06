package operator_statements;

import java.util.Scanner;

public class perfect_factor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int sum = 0;
        boolean perfect = false;

        for (int i = 1; i <= n/2; i++) {

            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n && n > 1) {
            perfect = true;
        }

        if (perfect) {
            System.out.println("Perfect number");
        }
        else {
            System.out.println("Not perfect number");
        }

        
    }
}