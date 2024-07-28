
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int a = this.squares * this.princePerSquare;
        int b = compared.squares * compared.princePerSquare;
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int a = this.squares * this.princePerSquare;
        int b = compared.squares * compared.princePerSquare;
        return a > b;
    }
}
