
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int x = scanner.nextInt();
        System.out.println("Where from?");
        int y = scanner.nextInt();
        for (int i = y; i <= x; i++) {
            System.out.println(i);
        }
    }
}
