// PACKAGE 
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.exceptions.UnfeasableOperationException;
import java.util.ArrayList;
import java.util.List;

public class VehiclePark {

    // ATTRIBUTI
    List<Vehicle> listVehicle;
    
    // COSTRUTTORI
    public VehiclePark() {
        listVehicle = new ArrayList();
    }
    
    // GETTER
    public List<Vehicle> getListVehicle() {
        return listVehicle;
    }
    
    // toString
    @Override
    public String toString() {
        return "VehiclePark{" + "listVehicle=" + listVehicle + '}';
    }
    
    // METODO PER AGGIUNGERE UN VEICOLO ALLA LISTA CONTENENTE TUTTI I VEICOLI POSSEDUTI DALL'AZIENDA DI NOLEGGI
    public void addVehicle(Vehicle vehicle) throws UnfeasableOperationException  {
        if (listVehicle.contains(vehicle)) {
            System.out.println("Vehicle " + vehicle.getVehicleIdentificationNumber() + "already present in the vehicle");
            throw new UnfeasableOperationException("Vehicle already present in the Park");            
        }
        listVehicle.add(vehicle);
    }        
 
}
