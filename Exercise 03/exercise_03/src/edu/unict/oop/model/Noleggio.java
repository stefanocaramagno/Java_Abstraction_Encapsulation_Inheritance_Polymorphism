// PACKAGE
package edu.unict.oop.model;

public class Noleggio {
    
    // ATTRIBUTI
    private final long rentalPeriod;
    private final RentalUser rentalUser;
    private double rentalTotalCost;
    
    // COSTRUTTORI
    public Noleggio(long rentalPeriod, RentalUser rentalUser, double rentalTotalCost) {
        this.rentalPeriod = rentalPeriod;
        this.rentalUser = rentalUser;
        this.rentalTotalCost = rentalTotalCost;
    }
    
    // GETTER
    public long getRentalPeriod() {
        return rentalPeriod;
    }

    public RentalUser getRentalUser() {
        return rentalUser;
    }

    public double getRetalTotalCost() {      
        return rentalTotalCost;
    }
    
    // SETTER
    public void setRentalTotalCost(double rentalTotalCost) {
        this.rentalTotalCost = rentalTotalCost;
    }
    
    // toString
    @Override
    public String toString() {
        return "Noleggio{" + "rentalPeriod=" + rentalPeriod + ", rentalUser=" + rentalUser 
                           + ", rentalTotalCost=" + rentalTotalCost + '}';
    }   
    
}
