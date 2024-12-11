// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.enumarations.Size;
import edu.unict.oop.interfaces.OnSite;
import edu.unict.oop.interfaces.TakeAway;

public class BottledDrink extends Drink implements TakeAway, OnSite {
    
    // ATTRIBUTI
    private double price;
    private final Size size;
    private Delivery delivery;
    private int tableID;
    
    // COSTRUTTORI
    public BottledDrink(String name, String brand, double price, Size size, Delivery delivery) {
        super(name, brand);
        this.price = price;
        this.size = size;
        this.delivery = delivery;
    }   
    
    public BottledDrink(String name, String brand, double price, Size size, int tableID) {
        super(name, brand);
        this.price = price;
        this.size = size;
        this.tableID = tableID;
    }        
    
    // GETTER
    public double getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }
    
    // toString
    @Override
    public String toString() {
        return "BottledDrink{" + "nome=" + super.getName() + ", brand=" + super.getBrand()  
                               + ", price=" + price + ", size=" + size 
                               + ", delivery=" + delivery + ", tableID=" + tableID + '}';
    }

    @Override
    public Delivery getDelivery() {
        return this.delivery;
    }

    @Override
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    @Override
    public int getTableID() {
        return this.tableID;
    }

    @Override
    public void setTableID(int tableID) {
        this.tableID = tableID;
    }
    
     // Metodo per calcolare il Prezzo della Bibita Imbottigliata
    @Override
    public double calculatePrice() {
        return this.price;
    }   
    
    
    
    
    
}
