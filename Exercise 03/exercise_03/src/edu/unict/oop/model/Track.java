// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.exceptions.UnfeasableOperationException;
import java.time.LocalDate;

public class Track extends Van {
    
    // ATTRIBUTI
    private final int cubage;
    
    // COSTUTTORI
    public Track(String brand, String vanModel, String vehicleIdentificationNumber, LocalDate datePlacedOnTheRoad, int cubage) throws UnfeasableOperationException {
        super(brand, vanModel, vehicleIdentificationNumber, datePlacedOnTheRoad);
        this.cubage = cubage;
    }
    
    // GETTER
    public int getCubage() {
        return cubage;
    }
   
    // toString
    @Override
    public String toString() {
        return "Track{" + "brand=" + super.getBrand() + ", model=" + super.getVanModel()
                          + ", vehicleIdentificationNumber=" + super.getVehicleIdentificationNumber()
                          + ", datePlacedOnTheRoad=" + super.getDatePlacedOnTheRoad() + ", cubage=" + cubage + '}';
    }    

    @Override
    public double calculatePrice() {
        double rentalCost = cubage * 10;
        return rentalCost;
    }
 
}
