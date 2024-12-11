// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.interfaces.TakeAway;
import java.util.ArrayList;
import java.util.List;

public class Scontrino {
    
    // COSTANTI
    private static int MAX_PRODUCTS = 10;
    
    // ATTRIBUTI
    private List<TakeAway> products;
    private Delivery destination;   
    private double totalPrice;
    private double deliveryCost;
    
    // COSTRUTTORI
    public Scontrino() {
        this.products = new ArrayList<>(MAX_PRODUCTS);
        totalPrice = 0;
        deliveryCost = 0;
    }  
    
    public boolean addProduct(TakeAway p){
        if( this.products.size() < MAX_PRODUCTS ) {
            if(!checkDestination(p.getDelivery()) ){
                System.out.println("Destination Non Valid");
                return false;
            }
            this.products.add(p);
            this.totalPrice =  this.totalPrice + p.calculatePrice();
            return true;
        }
        return false;
    }
    
    public boolean removeProduct(int position){
        if( position < this.products.size() ) {
            this.totalPrice -= this.products.get(position).calculatePrice();
            this.products.remove(position);
            System.out.println("Product Removed");
            return true;
        }
        return false;
    }    
    
    public double getTotal() {
        return totalPrice + deliveryCost;
    }

    private boolean checkDestination(Delivery d){
        if (this.destination == null) {
            this.destination = d;
        }

        if (this.destination.equals(d)) {
            if (d.isSpeedy() && this.deliveryCost == 0) {
                this.deliveryCost = 2;
            }
            return true;
        }
        else {
            return false;
        }
    }
    
      
}
