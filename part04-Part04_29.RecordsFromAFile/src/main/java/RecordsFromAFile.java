
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] word = line.split(",");
                System.out.println(word[0] + ", age: " + word[1] + " years");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
