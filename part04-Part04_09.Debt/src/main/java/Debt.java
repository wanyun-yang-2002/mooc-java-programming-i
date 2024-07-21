/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23548
 */
public class Debt {
    private double balabce;
    private double interestRate;
    
    public Debt(double initialBalance, double initialInterestRate) {
        this.balabce = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance() {
        System.out.println(this.balabce);
    }
    
    public void waitOneYear() {
        this.balabce = this.balabce * this.interestRate;
    }
}
