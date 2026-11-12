package Arrays_exp;

public class sum_previous_next_array {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60};

        int[] number = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            int previous = 0;
            int next = 0;

            if (i > 0) {
                previous = numbers[i - 1];
            }

            if (i < numbers.length - 1) {
                next = numbers[i + 1];
            }

            number[i] = previous + next;
        }

        System.out.println("New Array:");

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}