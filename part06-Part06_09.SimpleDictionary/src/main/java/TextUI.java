/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23548
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = this.scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else if (input.equals("add")) {
                System.out.println("Word: ");
                String word = this.scanner.nextLine();
                System.out.println("Translation: ");
                String trans = this.scanner.nextLine();
                this.dict.add(word, trans);
            } else if (input.equals("search")) {
                System.out.println("To be translated: ");
                String word = this.scanner.nextLine();
                String trans = this.dict.translate(word);
                if (trans == null) {
                    System.out.println("Word "+ word + " was not found");
                } else {
                    System.out.println("Translation: " + trans);
                }
            }
            System.out.println("Unknown command");
        }
        System.out.println("Bye bye!");
    }
}
