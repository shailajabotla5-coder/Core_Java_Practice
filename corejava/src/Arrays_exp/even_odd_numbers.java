package Arrays_exp;

public class even_odd_numbers {

    public static void main(String[] args) {

        int[] numbers = {10, 12, 13, 15, 0};

        System.out.println("Even numbers:");

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        System.out.println("Odd numbers:");

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}