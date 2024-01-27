
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = 0;
        int r2 = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            } else {
                r1 += 1;
                r2 += n;
            }
        }
        System.out.println("Number of numbers: " + r1);
        System.out.println("Sum of the numbers: " + r2);
    }
}
