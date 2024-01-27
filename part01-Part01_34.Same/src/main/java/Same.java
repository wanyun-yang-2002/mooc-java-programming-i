
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String v1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String v2 = scan.nextLine();
        if (v1.equals(v2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
