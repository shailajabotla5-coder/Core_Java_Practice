package Arrays_exp;

public class orderofelements {

    public static void main(String[] args) {

        int[] order = {1, 0, 2, 0, 0, 9, 1, 0, 7, 0};

        int index = 0;
        // Step 1: Move non-zero elements to the beginning
        for (int i = 0; i < order.length; i++) {
        if (order[i] != 0) {
        order[index] = order[i];
        index++;
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (index < order.length) {
            order[index] = 0;
            index++;
        }

        // Step 3: Print the array
        for (int i = 0; i < order.length; i++) {
            System.out.println(order[i]);
        }
    }
}