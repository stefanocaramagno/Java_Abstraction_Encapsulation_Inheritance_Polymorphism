// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.interfaces.OnSite;

public class DraftDrink extends Drink implements OnSite {
    
    // ATTRIBUTI
    private final double liter;
    private double literCost;
    private double price;
    private int tableID;
                
    // COSTRUTTORI
    public DraftDrink(String name, String brand, double liter, double literCost, double price, int tableID) {
        super(name, brand);
        this.liter = liter;
        this.literCost = literCost;
        this.price = price;
        this.tableID = tableID;
    }
    
    // GETTER
    public double getLiter() {
        return liter;
    }

    public double getLiterCost() {
        return literCost;
    }

    public double getPrice() {
        return price;
    }
    
    // SETTER
    public void setLiterCost(double literCost) {
        this.literCost = literCost;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    // toString
    @Override
    public String toString() {
        return "DraftDrink{" + "name=" + super.getName() + ", brand=" + super.getBrand() 
                             + ", liter=" + liter + ", literCost=" + literCost 
                             + ", price=" + price + ", tableID=" + tableID + '}';
    }
    
    // Metodo per calcolare il Prezzo della Bibita in Brocca
    @Override
    public double calculatePrice() {
        return liter * literCost;
    }

    @Override
    public int getTableID() {
        return this.tableID;
    }

    @Override
    public void setTableID(int tableID) {
        this.tableID = tableID;
    }          
                
}
