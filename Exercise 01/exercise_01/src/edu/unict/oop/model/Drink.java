// PACKAGE
package edu.unict.oop.model;

public class Drink extends Product {
    
    // ATTRIBUTI
    private final String brand;
    
    // COSTRUTTORI
    public Drink(String name, String brand) {
        super(name);
        this.brand = brand;
    }
    
    // GETTER
    public String getBrand() {
        return brand;
    }
    
    // toString
    @Override
    public String toString() {
        return "Drink{" + "brand=" + brand + '}';
    }

}
