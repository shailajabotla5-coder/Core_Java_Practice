package Arrays_exp;

import java.util.Scanner;

public class Occurrence_of_element {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};

        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an element:");
        int element = sc.nextInt();

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] == element) {
                count++;
            }
        }

        System.out.println("Count of the element is: " + count);

        
    }
}