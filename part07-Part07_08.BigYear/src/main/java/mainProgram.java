
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                database.addBird(name, latinName);
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                if (!database.observeBird(name)) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equalsIgnoreCase("All")) {
                database.printAllBirds();
            } else if (command.equalsIgnoreCase("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                database.printBird(name);
            } else if (command.equalsIgnoreCase("Quit")) {
                break;
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
}
