// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.enumarations.MotorcycleModel;
import edu.unict.oop.exceptions.UnfeasableOperationException;
import edu.unict.oop.interfaces.CapacityPassenger;
import java.time.LocalDate;

public class Motorcycle extends Vehicle implements CapacityPassenger {

    // ATTRIBUTI
    private final MotorcycleModel motorcycleModel;
    private final double costPerDay;
       
    // COSTRUTTORI
    public Motorcycle(String brand, MotorcycleModel motorcycleModel, String vehicleIdentificationNumber, LocalDate datePlacedOnTheRoad, double costPerDay) throws UnfeasableOperationException {
        super(brand, vehicleIdentificationNumber, datePlacedOnTheRoad);
        this.motorcycleModel = motorcycleModel;
        this.costPerDay = costPerDay;
    }

    // GETTER
    public MotorcycleModel getMotorcycleModel() {
        return motorcycleModel;
    }
    
    
    public double getCostPerDay() {
        return costPerDay;
    }
    
    // toString
    @Override
    public String toString() {
        return "Motorcycle{" + "brand=" + super.getBrand() + ", motorcycleModel=" + motorcycleModel
                          + ", vehicleIdentificationNumber=" + super.getVehicleIdentificationNumber()
                          + ", datePlacedOnTheRoad=" + super.getDatePlacedOnTheRoad() 
                          + ", costPerDay=" + costPerDay + '}';
    } 

    @Override
    public int getCapacityPassengers() {       
        return 0;
        
    }

    @Override
    public double calculatePrice() {
        return costPerDay;
    } 
  
}
