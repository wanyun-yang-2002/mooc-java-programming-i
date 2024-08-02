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
    private TodoList todolist;
    private Scanner scanner;
    
    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = this.scanner.nextLine();
            switch (input) {
                case "stop":
                    return; // 退出方法，从而停止程序
                case "add":
                    System.out.println("To add:");
                    String task = this.scanner.nextLine(); // 获取待办事项内容
                    this.todolist.add(task);
                    break; // 防止继续执行下一个 case 语句
                case "list":
                    this.todolist.print();
                    break; // 防止继续执行下一个 case 语句
                case "remove":
                    System.out.println("Which one is removed?");
                    int index = Integer.parseInt(this.scanner.nextLine()); // 获取待删除事项的索引
                    this.todolist.remove(index);
                    break; // 防止继续执行下一个 case 语句
                default:
                    System.out.println("Unknown command");
                    break; // 防止继续执行下一个 case 语句
            }
        }
    }
}
