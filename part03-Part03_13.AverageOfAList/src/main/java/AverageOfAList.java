
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        int s = 0;
        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            s += n;
            list.add(n);
        }
        System.out.println("Average: " + (double) s / list.size());
        
    }
}
