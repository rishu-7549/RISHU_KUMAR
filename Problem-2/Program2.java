
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        int num = 1;
        for (int i = 0; i < a; i++) {
            System.out.print(num + (i < a - 1 ? ", " : ""));
            num += 2;
        }

    }
}
