package Arrays_exp;

public class Kth_element {

    public static void main(String[] args) {

        int[] a = {2, 4, 8, 10, 3};

        int k = 3;
   

        for (int i = 0; i < a.length; i++) {
        	   int count = 0;
           

            for (int j = 0; j < a.length; j++) {

                if (a[i] < a[j]) {
                    count++;
                }
            }

            if (count == k - 1) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}