/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23548
 */
public class Cube {
    private int edgeLength;
    
    public Cube (int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public int volume() {
        int vol = this.edgeLength * this.edgeLength * this.edgeLength;
        return vol;
    }
    
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
}
