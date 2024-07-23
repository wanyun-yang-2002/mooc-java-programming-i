
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner f = new Scanner(Paths.get(file))) {
            while (f.hasNextLine()) {
                l.add(f.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed." );
        }
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if (l.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
