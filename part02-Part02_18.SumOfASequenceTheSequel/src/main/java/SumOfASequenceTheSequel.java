
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int n = Integer.valueOf(scanner.nextLine());
        int res = 0;
        for (int i = first; i <= n; i++) {
            res += i;
        }
        System.out.println("The sum is " + res);

    }
}
