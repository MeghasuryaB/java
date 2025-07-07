
import java.util.*;

public class hex2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {

                int profit = arr[i] - min;
                if (profit > max) {
                    max = profit;
                }
            }
        }
        System.out.println(max);
    }
}
