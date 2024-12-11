// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.interfaces.RentalCost;

public class RentalVehicle {

    // ATTRIBUTI
    private final Vehicle vehicle;
    private final Noleggio noleggio;
    
    // COSTRUTTORI
    public RentalVehicle(Vehicle vehicle, Noleggio noleggio) {
        this.vehicle = vehicle;
        this.noleggio = noleggio;
    }
    
    // GETTER
    public Vehicle getVehicle() {
        return vehicle;
    }

    public Noleggio getNoleggio() {
        return noleggio;
    }
       
    // toString
    @Override
    public String toString() {
        return "RentalArchive{" + "vehicle=" + vehicle + ", noleggio=" + noleggio + '}';
    }
    
    // CALCOLO COSTO TOTALE DEL NOLEGGIO
    public double calculateTotalCost(long rentalPeriod){
        if(noleggio.getRentalUser() == null){
            return 0;
        }
        
        double TotalRentalCost = 0;
        
        if(vehicle instanceof RentalCost){
            TotalRentalCost = rentalPeriod * ((RentalCost)vehicle).calculatePrice();
        }   
        
        return TotalRentalCost;
    }
    
}
