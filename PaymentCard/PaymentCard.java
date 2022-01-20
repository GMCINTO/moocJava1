/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glene
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        // write code here
    }

    public String toString() {
        // write code here
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        if (balance - 2.60 >= 0) {
            balance = balance - 2.60;
        }
        // write code here
    }

    public void eatHeartily() {
        if (balance - 4.60 >= 0) {
            balance = balance - 4.60;
        }

        // write code here
    }

    public void addMoney(double amount) {
        if(amount > 0){
        this.balance = balance + amount;
        }
        if(balance > 150){
            balance = 150;
        }
    }
}
