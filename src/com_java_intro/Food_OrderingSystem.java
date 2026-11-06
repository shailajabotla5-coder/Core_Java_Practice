
package com_java_intro;

import java.util.Scanner;

public class Food_OrderingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== FOOD ORDERING SYSTEM =====");
        System.out.println("1. Pizza - Rs.200");
        System.out.println("2. Burger - Rs.120");
        System.out.println("3. Biryani - Rs.180");
        System.out.println("4. Noodles - Rs.100");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("You ordered Pizza");
                System.out.println("Total Bill: Rs." + (200 * quantity));
                break;

            case 2:
                System.out.println("You ordered Burger");
                System.out.println("Total Bill: Rs." + (120 * quantity));
                break;

            case 3:{
                System.out.println("You ordered Biryani");
                System.out.println("Total Bill: Rs." + (180 * quantity));
                break;

            case 4:
                System.out.println("You ordered Noodles");
                System.out.println("Total Bill: Rs." + (100 * quantity));
                break;

            default:
                System.out.println("Invalid choice! Please select 1 to 4.");
                break;
        }

        sc.close();
    }
}

