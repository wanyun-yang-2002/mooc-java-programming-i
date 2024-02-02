
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        int s = 9999;
        while (true) {
            int n = scanner.nextInt();
            if (n == 9999) {
                break;
            }
            if (n < s) {
                s = n;
            }
            list.add(n);
        }
        System.out.println("Smallest number: "+s);
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        for (int i=0; i<list.size(); i++) {
            if (s==list.get(i)) {
                System.out.println("Found at index: "+i);
            }
        }
    }
}
