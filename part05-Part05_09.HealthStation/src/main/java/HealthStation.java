
public class HealthStation {
    private int cnt;
    
    public HealthStation() {
        this.cnt = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.cnt = this.cnt + 1;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.cnt;
    }
}
