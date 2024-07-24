
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        try (Scanner f = new Scanner(Paths.get(file))) {
            while (f.hasNextLine()) {
                num.add(Integer.valueOf(f.nextLine()));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int cnt = 0;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) <= upperBound && num.get(i) >= lowerBound) {
                cnt++;
            }
        }
        System.out.println("Numbers: " + cnt);
    }

}
