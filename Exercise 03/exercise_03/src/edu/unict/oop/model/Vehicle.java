// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.exceptions.UnfeasableOperationException;
import edu.unict.oop.interfaces.RentalCost;
import java.time.LocalDate;

public abstract class Vehicle implements RentalCost {
    
    // ATTRIBUTI
    private final String brand;
    private final String vehicleIdentificationNumber;
    private final LocalDate datePlacedOnTheRoad;
    
    // COSTRUTTORI
    public Vehicle(String brand, String vehicleIdentificationNumber, LocalDate datePlacedOnTheRoad) throws UnfeasableOperationException {
        this.brand = brand;
 
        if (vehicleIdentificationNumber.length() > 17) {
            System.err.println("Vehicle " + vehicleIdentificationNumber + "is not possible to add");
            throw new UnfeasableOperationException("vehicleIdentificationNumber too long"); 
        } 
        
        else if (vehicleIdentificationNumber.length() == 0){
            System.err.println("Vehicle " + vehicleIdentificationNumber + "is not possible to add");
            throw new UnfeasableOperationException("vehicleIdentificationNumber is null");    
            
        }else{
            this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        }    
   
        this.datePlacedOnTheRoad = datePlacedOnTheRoad;
    }
    
    // GETTER
    public String getBrand() {
        return brand;
    }

    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public LocalDate getDatePlacedOnTheRoad() {
        return datePlacedOnTheRoad;
    }
    
    // toString
    @Override
    public String toString() {
        return "Vehicle{" + "brand=" + brand 
                             + ", vehicleIdentificationNumber=" + vehicleIdentificationNumber 
                             + ", datePlacedOnTheRoad=" + datePlacedOnTheRoad + '}';
    }

    @Override
    public double calculatePrice() {
        return 0;
    }   
    
}
