/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 23548
 */
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String id, String name) {
        this.identifier = id;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        Archive compareArchive = (Archive) compared;
        if (this.identifier.equals(compareArchive.identifier)) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
