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

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
            this.maximumWeight -= suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for (Suitcase suit: this.suitcases) {
            suit.printItems();
        }
    }
    
    @Override
    public String toString() {
        int x = this.suitcases.size();
        int y = 0;
        for (Suitcase item: this.suitcases) {
            y += item.totalWeight();
        }
        return x + " suitcases (" + y + " kg)";
    }
}
