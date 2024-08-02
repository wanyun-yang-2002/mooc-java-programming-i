/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23548
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todolist;
    
    public TodoList() {
        this.todolist = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todolist.add(task);
    }
    
    public void print() {
        int index = 1;
        for (String item: this.todolist) {
            System.out.println(index + ": " + item);
            index++;
        }
    }
    
    public void remove(int number) {
        this.todolist.remove(number - 1);
    }
}
