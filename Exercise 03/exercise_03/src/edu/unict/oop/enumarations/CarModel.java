// PACKAGE
package edu.unict.oop.enumarations;

public enum CarModel {
    SUV(5),
    CITYCAR(4),
    MEDIUM(5),
    LARGE(7),
    LUSSO(5),;
    
    // ATTRIBUTI
    private final int NumPassenger;
    
    // COSTRUTTORI
    private CarModel(int NumPassenger) {
        this.NumPassenger = NumPassenger;
    }
    
    // GETTER
    public int getNumPassenger() {
        return NumPassenger;
    }
    
}
