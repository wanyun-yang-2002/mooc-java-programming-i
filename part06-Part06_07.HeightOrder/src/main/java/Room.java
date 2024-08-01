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

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (isEmpty()) {
            return null;
        }
        int shortest = this.persons.get(0).getHeight();
        Person res = this.persons.get(0);
        for (Person item: this.persons) {
            if (item.getHeight() < shortest) {
                shortest = item.getHeight();
                res = item;
            }
        }
        return res;
    }
    
    public Person take() {
        if (isEmpty()) {
            return null;
        }
        Person res = shortest();
        this.persons.remove(res);
        return res;
    }
}
