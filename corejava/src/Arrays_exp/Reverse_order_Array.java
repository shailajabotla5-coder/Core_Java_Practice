package Arrays_exp;

public class Reverse_order_Array {

    public static void main(String[] args) {

        int[] numbers = {11, 12, 13, 14, 15, 16};

        for (int i = 0; i < numbers.length; i++) {

            int n = numbers[i];
            int rev = 0;

            while (n > 0) {

                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }

            numbers[i] = rev;
        }

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }
    }
}