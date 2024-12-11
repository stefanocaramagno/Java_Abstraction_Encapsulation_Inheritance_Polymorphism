// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.enumarations.CarModel;
import java.util.ArrayList;
import java.util.List;

public class RentalVehiclePark {
    
    // ATTRIBUTI
    List<RentalVehicle> rentalVehicleList;
    
    // COSTRUTTORI
    public RentalVehiclePark() {
        rentalVehicleList = new ArrayList();
    }
    
    // GETTER
    public List<RentalVehicle> getRentalVehicleList() {
        return rentalVehicleList;
    }
    
    // toString
    @Override
    public String toString() {
        return "RentalPark{" + "rentalVehicleList=" + rentalVehicleList + '}';
    }
    
    // METODO PER AGGIUNGERE UN VEICOLO ALLA LISTA CONTENENTE TUTTI I VEICOLI POSSEDUTI DALL'AZIENDA DI NOLEGGI ATTUALMENTE NOLEGGIATI
    public void addRentalVehicle(RentalVehicle rentalVehicle) {
        rentalVehicleList.add(rentalVehicle);
    } 
    
     // METODO PER RIMUOVERE UN VEICOLO ALLA LISTA CONTENENTE TUTTI I VEICOLI POSSEDUTI DALL'AZIENDA DI NOLEGGI ATTUALMENTE NOLEGGIATI   
    public void removeRentalVehicle(RentalVehicle rentalVehicle){
        rentalVehicleList.remove(rentalVehicle);
    }
    
    // METODO PER CERCARE UN VEICOLO ALLA LISTA CONTENENTE TUTTI I VEICOLI POSSEDUTI DALL'AZIENDA DI NOLEGGI ATTUALMENTE NOLEGGIATI 
    public List<Car> searchRentalVehicle(CarModel carModel, double minimalCost, double maximumCost){
        List<Car> foundVehicle = new <RentalVehicle>ArrayList();
        
        for (RentalVehicle rentalVehicle : rentalVehicleList)
            if (rentalVehicle instanceof Car){
                if(((Car)rentalVehicle).getCarModel() == carModel && 
                    ((Car)rentalVehicle).getNoleggio().getRetalTotalCost() > minimalCost && 
                    ((Car)rentalVehicle).getNoleggio().getRetalTotalCost() < maximumCost){
                        foundVehicle.add((Car) rentalVehicle);                    
                }
            }  
        return foundVehicle;
    }
    
    
    
    
    
    
    
   
}
