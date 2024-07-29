
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance() {
        if (this.day < 30) {
            this.day++;
        } else if (this.day == 30 && this.month < 12) {
            this.day = 1;
            this.month++;
        } else if (this.day == 30 && this.month == 12) {
            this.day = 1;
            this.month = 1;
            this.year++;
        }
    }
    
    public void advance(int howManyDays) {
        while (howManyDays > 0) {
            this.advance();
            howManyDays--;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newSimpleDate = new SimpleDate(this.day, this.month, this.year);
        newSimpleDate.advance(days);
        return newSimpleDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
