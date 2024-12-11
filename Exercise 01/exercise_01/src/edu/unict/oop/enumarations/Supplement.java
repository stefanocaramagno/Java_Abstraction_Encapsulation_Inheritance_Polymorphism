// PACKAGE
package edu.unict.oop.enumarations;

public enum Supplement {
    FUNGHI(10),
    PATATINE(20),
    PROSCIUTTO(30),
    SALAME(40),
    OLIVE(50),
    ACCIUGHE(60),
    WRUSTEL(70);
    
    // ATTRIBUTI
    private double price;
   
    // COSTRUTTORI
    private Supplement(double price) {
        this.price = price;
    }  
    
    // GETTER
    public double getPrice(){
       return price;
    }  
}
