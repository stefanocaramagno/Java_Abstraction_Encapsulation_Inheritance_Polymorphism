// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.enumarations.CarModel;
import edu.unict.oop.exceptions.UnfeasableOperationException;
import edu.unict.oop.interfaces.CapacityPassenger;
import java.time.LocalDate;

public class Car extends Vehicle implements CapacityPassenger {

    // ATTRIBUTI
    private final CarModel carModel;
    private final double costPerDay;
    
    // COSTRUTTORI
    public Car(String brand, CarModel carModel, String vehicleIdentificationNumber, LocalDate datePlacedOnTheRoad, double costPerDay) throws UnfeasableOperationException {
        super(brand, vehicleIdentificationNumber, datePlacedOnTheRoad);
        this.carModel = carModel;
        this.costPerDay = costPerDay;
    }
 
    // GETTER
    public CarModel getCarModel() {
        return carModel;
    }
     
    public double getCostPerDay() {
        return costPerDay;
    }
     
    // toString   
    @Override
    public String toString() {
        return "Car{" + "brand=" + super.getBrand() + ", carModel=" + carModel
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
