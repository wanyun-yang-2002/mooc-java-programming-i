import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        division(n1, n2);
        // division(3, 5);
    }
    // implement the method here
    public static void division(int number1, int number2){
        System.out.println((double) number1 / number2);
    }
}
