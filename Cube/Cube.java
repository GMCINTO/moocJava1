/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glene
 */
public class Cube {

    private int length;
    //int volume = 0;

    public Cube(int edgeLength) {
        this.length = edgeLength;
        //this.volume = volume;
    }

    public int volume() {

        //volume = this.length * this.length * this.length;

        return this.length * this.length * this.length;
    }
     @Override

    public String toString() {

        return "The length of the edge is " + this.length + " and the volume " + this.volume();
        //this.length * this.length * this.length;
    }
}
