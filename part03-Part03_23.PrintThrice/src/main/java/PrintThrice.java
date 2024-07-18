
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        System.out.print("Give a word:");
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        String word = scanner.nextLine();
        System.out.print(word + word + word);

    }
}
