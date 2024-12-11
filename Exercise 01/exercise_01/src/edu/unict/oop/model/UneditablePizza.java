// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.enumarations.Flour;
import edu.unict.oop.interfaces.TakeAway;
import java.util.List;

public class UneditablePizza extends Pizza implements TakeAway {
    
    // COSTANTI
    public static final double discountFactor = 0.15;
    
    // ATTRIBUTI
    private Delivery delivery;

    // COSTRUTTORI
    public UneditablePizza(String name, List<String> ingredients, double price, Flour flour, Delivery delivery) {
        super(name, ingredients, price, flour);
        this.delivery = delivery;
    }
    
    // toString
    @Override
    public String toString() {
        return "UneditablePizza{" + "name=" + super.getName() + ", ingredients=" + super.getIngredients()
                                  + ", price=" + super.getPrice() + ", flour=" + super.getFlour()
                                  + ", delivery=" + delivery + '}';
    }

    // Metodo per calcolare il Prezzo della Pizza da mangiare Da Asporto
    @Override
    public double calculatePrice() {
        return super.calculatePrice() * (1 - discountFactor);    
    }
    
    @Override
    public Delivery getDelivery() {
        return delivery;
    }

    @Override
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
      
}
