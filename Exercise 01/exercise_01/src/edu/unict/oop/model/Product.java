// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.interfaces.Priced;

public abstract class Product implements Priced {
    
    // ATTRIBUTI
    private final String name;
    
    // COSTRUTTORI
    public Product(String name) {
        this.name = name;
    }
    
    // GETTER
    public String getName() {
        return name;
    }
 
    // toString
    @Override
    public String toString() {
        return "Product{" + "name=" + name + '}';
    }
    
    // Metodo per calcolare il prezzo dei Prodotto
    @Override
    public double calculatePrice() {
       return 0; 
    }
    
    
}
