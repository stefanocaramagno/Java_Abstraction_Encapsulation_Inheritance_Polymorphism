// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.enumarations.Flour;
import edu.unict.oop.enumarations.Supplement;
import edu.unict.oop.interfaces.OnSite;
import java.util.List;

public class EditablePizza extends Pizza implements OnSite {
    
    // COSTANTI
    private static final int MAXSUPPLEMENTS = 3;
    
    // ATTRIBUTI
    private int tableID;
    private List<Supplement> supplements;
    private int supplementsNumber;    
    private double supplementsCost;
   
    // COSTRUTTORI
    public EditablePizza(String name, List<String> ingredients, double price, Flour flour, int tableID, List<Supplement> supplements) {
        super(name, ingredients, price, flour);
        this.tableID = tableID;
        this.supplements = supplements;
        supplementsNumber = 0;
        supplementsCost = 0;
    }

    // GETTER
    public static int getMAXSUPPLEMENTS() {
        return MAXSUPPLEMENTS;
    }

    public List<Supplement> getSupplements() {
        return supplements;
    }

    public int getSupplementsNumber() {
        return supplementsNumber;
    }

    public double getSupplementsCost() {
        return supplementsCost;
    }
    
    // toString
    @Override
    public String toString() {
        return "EditablePizza{" + "name=" + super.getName() + ", ingredients=" + super.getIngredients()
                                + ", price=" + super.getPrice() + ", flour=" + super.getFlour() 
                                + ", tableID=" + tableID + ", supplements=" + supplements 
                                + ", supplementsNumber=" + supplementsNumber   
                                + ", supplementsCost=" + supplementsCost + '}';
    }
    
    // Metodo per Aggiungere un Supplemento ad una Pizza da mangiare In Loco 
    public boolean addSupplement(Supplement supplement){
        if( (supplementsNumber == MAXSUPPLEMENTS) || getSupplements().contains(supplement) || getIngredients().contains(supplement) ){
            return false;
        }
        getSupplements().add(supplement);
        supplementsCost = supplementsCost + supplement.getPrice();
        supplementsNumber++;
        return true;
    }  
    
    // Metodo per Rimuovere un Ingrediente presente ad una Pizza da mangiare in Loco   
    public boolean removeIngredient(String ingredient){
        return getIngredients().remove(ingredient);
    }
    
    // Metodo per calcolare il Prezzo della Pizza da mangiare in Loco
    @Override
    public double calculatePrice() {
        return super.calculatePrice() + supplementsCost;
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
