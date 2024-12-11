// PACKAGE
package edu.unict.oop.enumarations;

public enum BikeModel {
    CITY(1),
    MOUNTAIN(2),
    ELETTRIC(3);
    
    // ATTRIBUTI
    private final int multiplicativeFactor;
    
    // COSTRUTTORI
    private BikeModel(int multiplicativeFactor) {
        this.multiplicativeFactor = multiplicativeFactor;
    }   
      
    // GETTER
    public int getMultiplicativeFactor() {
        return multiplicativeFactor;
    }
    
}
