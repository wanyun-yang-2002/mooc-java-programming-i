
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        while (true) {
            System.out.println("Give a number:");
            
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            } else {
                res += 1;
            }
        }
        System.out.println("Number of numbers: " + res);

    }
}
