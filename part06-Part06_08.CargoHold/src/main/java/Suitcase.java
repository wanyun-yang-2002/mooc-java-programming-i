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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.maxWeight -= item.getWeight();
        }
    }
    
    public void printItems() {
        for (Item i: items) {
            System.out.println(i);
        }
    }
    
    public int totalWeight() {
        int res = 0;
        for (Item i: items) {
            res += i.getWeight();
        }
        return res;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item res = new Item(this.items.get(0).getName(), this.items.get(0).getWeight());
        int heaviest = this.items.get(0).getWeight();
        for (Item i: items) {
            if (heaviest < i.getWeight()) {
                heaviest = i.getWeight();
                res = i;
            }
        }
        return res;
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        int x = this.items.size();
        int y = 0;
        for (Item i: items) {
            y += i.getWeight();
        }
        if (x == 1) {
            return x + " item (" + y + " kg)";
        } else {
            return x + " items (" + y + " kg)";
        }
    }
}
