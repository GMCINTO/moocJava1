/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glene
 */
//Constructor public Multiplier(int number).
//Method public int multiply(int number) which returns the value number passed to it multiplied by the number provided to the constructor.
public class Multiplier {

    private int number;

    public Multiplier(int number) {
        this.number = number;

    }

    public int multiply(int number) {
        
        int num = this.number*number;

        return num;
    }

}
