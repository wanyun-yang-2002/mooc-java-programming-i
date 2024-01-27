
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int number = v1 + v2;
        if (number >= 0) {
            System.out.println(Math.sqrt(number));
        }

    }
}
