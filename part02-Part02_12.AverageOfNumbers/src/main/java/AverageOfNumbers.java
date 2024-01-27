
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r1 = 0;
        double r2 = 0;
        while (true) {
            System.out.println("Give a number:");
            double n = Double.valueOf(scanner.nextLine());
            if (n == 0) {
                break;
            } else {
                r1 += 1;
                r2 += n;
            }
        }
        System.out.println("Average of the numbers: " + (r2 / r1));

    }
}
