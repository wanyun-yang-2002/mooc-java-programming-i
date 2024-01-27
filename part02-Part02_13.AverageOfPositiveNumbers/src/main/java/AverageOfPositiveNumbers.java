
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r1 = 0;
        double r2 = 0;
        while (true) {
            double n = Double.valueOf(scanner.nextLine());
            if (n == 0) {
                break;
            } else if (n > 0){
                r1 += 1;
                r2 += n;
            }
        }
        if (r1 == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(r2 / r1);
        }
        


    }
}
