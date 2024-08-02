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

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("What a joke!");
        this.logic();
    }
    
    public void printCommand() {
        System.out.println("Commands:\n" + "1 - add a joke\n" + "2 - draw a joke\n" + "3 - list jokes\n" + "X - stop");
    }
    
    public void logic() {
        while (true) {
            this.printCommand();
            String command = this.scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.jokes.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.jokes.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokes.printJokes();
            }
        }
        
    }
}
