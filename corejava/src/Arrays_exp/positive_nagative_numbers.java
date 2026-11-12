package Arrays_exp;

public class positive_nagative_numbers
{

    public static void main(String[] args) {

        int[] numbers = {10, -5, 30, -8, 50, 70};

        int positive = 0;
        int negative = 0;

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i] > 0) {
                positive++;
            }
            else if(numbers[i] < 0) {
                negative++;
            }
        }

        System.out.println("Positive numbers count: " + positive);
        System.out.println("Negative numbers count: " + negative);
    }
}