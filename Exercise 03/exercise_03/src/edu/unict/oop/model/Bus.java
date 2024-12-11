// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.exceptions.UnfeasableOperationException;
import edu.unict.oop.interfaces.CapacityPassenger;
import java.time.LocalDate;

public class Bus extends Van implements CapacityPassenger {
    
    // ATTRIBUTI
    private final int nSeats;
    
    // COSTUTTORI
    public Bus(String brand, String vanModel, String vehicleIdentificationNumber, LocalDate datePlacedOnTheRoad, int nSeats) throws UnfeasableOperationException {
        super(brand, vanModel, vehicleIdentificationNumber, datePlacedOnTheRoad);
        this.nSeats = nSeats;
    }
    
    // GETTER
    public int getnSeats() {
        return nSeats;
    }
    
    // toString
    @Override
    public String toString() {
        return "Bus{" + "brand=" + super.getBrand() + ", model=" + super.getVanModel()
                          + ", vehicleIdentificationNumber=" + super.getVehicleIdentificationNumber()
                          + ", datePlacedOnTheRoad=" + super.getDatePlacedOnTheRoad() + ", nSeats=" + nSeats + '}';
    } 
    
    @Override
    public int getCapacityPassengers() {       
        return 0;       
    }   

    @Override
    public double calculatePrice() {
        double rentalCost = nSeats * 15;
        return rentalCost;
    }
    
}
