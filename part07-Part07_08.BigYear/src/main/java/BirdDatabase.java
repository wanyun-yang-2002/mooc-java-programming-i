import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public boolean observeBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                bird.observe();
                return true;
            }
        }
        return false;
    }

    public void printAllBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void printBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
}
