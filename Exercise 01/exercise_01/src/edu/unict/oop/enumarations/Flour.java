// PACKAGE
package edu.unict.oop.enumarations;

public enum Flour {
    GRANODURO(1),
    INTEGRALE(2),
    RUSELLO(3),
    TIMILIA(3);

    // ATTRIBUTI
    private double price;
   
    // COSTRUTTORI
    private Flour(double price) {
        this.price = price;
    }  
    
    // GETTER
    public double getPrice(){
       return price;
    }  
 
}
