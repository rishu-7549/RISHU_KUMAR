
import java.util.*;

public class Program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the list: ");
        int n = sc.nextInt();

        int[] input = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : input) {
                if (num % i == 0) {
                    count++;
                }
            }
            result.put(i, count);
        }

        System.out.print("Count of multiples:");
        System.out.print(result);
    }
}
