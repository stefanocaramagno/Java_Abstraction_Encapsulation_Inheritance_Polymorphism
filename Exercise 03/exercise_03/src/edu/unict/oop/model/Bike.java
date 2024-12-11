// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.enumarations.BikeModel;
import edu.unict.oop.exceptions.UnfeasableOperationException;
import java.time.LocalDate;

public class Bike extends Vehicle {
     
    // ATTRIBUTI
    private final BikeModel bikeModel;
       
    // COSTRUTTURI
    public Bike(String brand, BikeModel bikeModel, String vehicleIdentificationNumber, LocalDate datePlacedOnTheRoad) throws UnfeasableOperationException {
        super(brand, vehicleIdentificationNumber, datePlacedOnTheRoad);
        this.bikeModel = bikeModel;
    }   
      
    // GETTER
    public BikeModel getBikeModel() {
        return bikeModel;
    }
      
    // toString
    @Override
    public String toString() {
        return "Bike{" + "brand=" + super.getBrand() + ", bikeModel=" + bikeModel
                          + ", vehicleIdentificationNumber=" + super.getVehicleIdentificationNumber()
                          + ", datePlacedOnTheRoad=" + super.getDatePlacedOnTheRoad() + '}';
    }    

    @Override
    public double calculatePrice() {
        double rentalCost = 5;
        return rentalCost;
    }
   
}
