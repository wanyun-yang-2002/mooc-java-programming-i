
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection "+ this.name + " is empty.";
        }
        String ans1 = "The collection "+ this.name + " has "+ this.elements.size() + " element:";
        String ans2 = "";
        for (String item: this.elements) {
            ans2 = ans2 + "\n" + item;
        }
        return ans1 + ans2;
    }
}
