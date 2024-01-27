
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        divisibleByThreeInRange(n1, n2);
        // division(3, 5);
    }
    // implement the method here
    public static void divisibleByThreeInRange(int number1, int number2){
        for (int i = number1; i <= number2; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
