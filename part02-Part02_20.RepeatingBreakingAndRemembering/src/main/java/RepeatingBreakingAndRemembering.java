
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            } else {
                sum += n;
                numbers += 1;
                if (n % 2 == 0) {
                    even += 1;
                } else {
                    odd += 1;
                }
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + ((double)sum / numbers));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
