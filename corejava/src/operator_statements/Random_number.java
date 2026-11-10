package operator_statements;

import java.util.Random;
import java.util.Scanner;

public class Random_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int guess = r.nextInt(10) + 1;

        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter a number between 1 and 10:");
            int n = sc.nextInt();

            if (guess== n) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            }
            else if (n < guess) {
                System.out.println("Too Low! Try Again.");
            }
            else {
                System.out.println("Too High! Try Again.");
            }

            if (i == 3) {
                System.out.println("Game Over!");
                System.out.println("Correct number is: " + guess);
            }
        }

   
    }
}