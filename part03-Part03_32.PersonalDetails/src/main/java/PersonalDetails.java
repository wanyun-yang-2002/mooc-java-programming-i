
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longname = 0;
        int cnt = 0;
        int sum = 0;
        String username = "";
        while (true) {
            String words = scanner.nextLine();
            if (words.isEmpty()) {
                break;
            }
            String[] parts = words.split(",");
            cnt += 1;
            sum = sum + Integer.valueOf(parts[1]);
            if (longname < parts[0].length()) {
                longname = parts[0].length();
                username = parts[0];
            }
        }
        System.out.println("Longest name: " + username );
        System.out.println("Average of the birth years: " + (double) sum / cnt);


    }
}
