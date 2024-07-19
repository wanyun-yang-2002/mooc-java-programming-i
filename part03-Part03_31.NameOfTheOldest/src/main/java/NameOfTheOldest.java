
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        String username = "";
        while (true) {
            String words = scanner.nextLine();
            if (words.isEmpty()) {
                break;
            }
            String[] parts = words.split(",");
            if (old < Integer.valueOf(parts[1])) {
                old = Integer.valueOf(parts[1]);
                username = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + username );


    }
}
