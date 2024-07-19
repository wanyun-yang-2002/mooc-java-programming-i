
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String words = scanner.nextLine();
            if (words.isEmpty()) {
                break;
            }
            String[] parts = words.split(",");
            if (sum < Integer.valueOf(parts[1])) {
                sum = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Age of the oldest: " + sum);


    }
}
