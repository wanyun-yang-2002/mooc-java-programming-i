
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }
            String[] word = sentence.split(" ");
            for (String i : word) {
                System.out.println(i);
            }
        }
        

    }
}
