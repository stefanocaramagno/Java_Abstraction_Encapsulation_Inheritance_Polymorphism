// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.enumarations.Flour;
import java.util.List;

public class Pizza extends Product {
    
    // ATTRIBUTI
    private List<String> ingredients;
    private double price;
    private Flour flour;
       
    // COSTRUTTORI
    public Pizza(String name, List<String> ingredients, double price, Flour flour) {
        super(name);
        this.ingredients = ingredients;
        this.price = price;
        this.flour = flour;
    }
    
    // GETTER
    public List<String> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public Flour getFlour() {
        return flour;
    }
    
    // SETTER
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }
    
    // toString
    @Override
    public String toString() {
        return "Pizza{" + "name=" + super.getName() + ", ingredients=" + ingredients 
                + ", price=" + price + ", flour=" + flour + '}';
    }

    // Metodo per calcolare il Prezzo della Pizza    
    @Override    
    public double calculatePrice(){
        return price + flour.getPrice();
    }
    
}
