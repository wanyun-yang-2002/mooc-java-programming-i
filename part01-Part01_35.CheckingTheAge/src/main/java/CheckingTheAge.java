
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int v = Integer.valueOf(scan.next());
        if (v >=0 && v <=120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
