import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            System.out.println("Publication year: ");
            String year = scanner.nextLine();
            books.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed? ");
        String ans = scanner.nextLine();
        for (Book item: books) {
            if (ans.equals("everything")) {
                System.out.println(item.everyThing());
            } else if (ans.equals("name")) {
                System.out.println(item.name());
            }
        }
    }
}
