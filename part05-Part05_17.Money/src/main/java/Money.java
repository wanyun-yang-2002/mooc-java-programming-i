
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newCent = this.cents + addition.cents;
        int newEuros = this.euros + addition.euros;
        if (newCent >= 100) {
            newEuros = newEuros + 1;
            newCent = newCent - 100;
        }
        Money newMoney = new Money(newEuros, newCent); 
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        } else if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int nCent = 0;
        int nEuros = 0;
        if (this.euros >= decreaser.euros && this.cents > decreaser.cents) {
            nEuros = this.euros - decreaser.euros;
            nCent = this.cents - decreaser.cents;
        } else if (this.euros > decreaser.euros && this.cents < decreaser.cents) {
            nEuros = this.euros - decreaser.euros - 1;
            nCent = 100 + this.cents - decreaser.cents;
        } 
        
        Money newMoney = new Money(nEuros, nCent); 
        return newMoney;
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
