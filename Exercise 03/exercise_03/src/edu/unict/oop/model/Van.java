// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.exceptions.UnfeasableOperationException;
import java.time.LocalDate;

public abstract class Van extends Vehicle {
    
    // ATTRIBUTI
    private final String vanModel;

    // COSTRUTTORI    
    public Van(String brand, String vanModel, String vehicleIdentificationNumber, LocalDate datePlacedOnTheRoad) throws UnfeasableOperationException {
        super(brand, vehicleIdentificationNumber, datePlacedOnTheRoad);
        this.vanModel = vanModel;
    }
    
    // GETTER
    public String getVanModel() {
        return vanModel;
    }
      
    // toString
    @Override
    public String toString() {
        return "Van{" + "brand=" + super.getBrand() + ", vanModel=" + vanModel
                          + ", vehicleIdentificationNumber=" + super.getVehicleIdentificationNumber()
                          + ", datePlacedOnTheRoad=" + super.getDatePlacedOnTheRoad() + '}';
    }  
    
}
