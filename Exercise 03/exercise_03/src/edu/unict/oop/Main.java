// PACKAGE
package edu.unict.oop;

// IMPORT
import edu.unict.oop.enumarations.BikeModel;
import edu.unict.oop.enumarations.CarModel;
import edu.unict.oop.enumarations.MotorcycleModel;
import edu.unict.oop.exceptions.UnfeasableOperationException;
import edu.unict.oop.model.Bike;
import edu.unict.oop.model.Bus;
import edu.unict.oop.model.Car;
import edu.unict.oop.model.Motorcycle;
import edu.unict.oop.model.Noleggio;
import edu.unict.oop.model.RentalVehiclePark;
import edu.unict.oop.model.RentalVehicle;
import edu.unict.oop.model.RentalUser;
import edu.unict.oop.model.Track;
import edu.unict.oop.model.VehiclePark;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        System.out.println("Inizio Programma!\n");
           
        // Si Instanzia l'oggetto Parco Veicoli dell'Azienza        
        VehiclePark vehiclePark = new VehiclePark();
        
        // Si Instanziano i Veicoli e si Aggiungono i Veicoli al Parco Veicoli dell'Azienza
        
        // --> Auto <--
        Car car = null;
        try {
            LocalDate datePlacedOnTheRoadCar = LocalDate.of(2023, 3, 1);       
            car = new Car("Ford", CarModel.CITYCAR, "01", datePlacedOnTheRoadCar, 50);                   
            vehiclePark.addVehicle(car);  
            
        } catch (UnfeasableOperationException ex){
            System.out.println(ex.getMessage());  
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
           
        // --> Bici <--          
        Bike bike = null;
        try {
            LocalDate datePlacedOnTheRoadBike = LocalDate.of(2023, 3, 1);                  
            bike = new Bike("Rock Rider", BikeModel.MOUNTAIN, "02", datePlacedOnTheRoadBike);                  
            vehiclePark.addVehicle(bike);  
            
        } catch (UnfeasableOperationException ex){
            System.out.println(ex.getMessage());  
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }           
               
        // --> Moto <--
        Motorcycle motorcycle = null;
        try {
            LocalDate datePlacedOnTheRoadMotorcycle = LocalDate.of(2023, 3, 1);   
            motorcycle = new Motorcycle("Piaggio", MotorcycleModel.CITY, "03", datePlacedOnTheRoadMotorcycle, 30);                 
            vehiclePark.addVehicle(motorcycle);  
            
        } catch (UnfeasableOperationException ex){
            System.out.println(ex.getMessage());  
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }         
              
        // --> Bus <--        
        Bus bus = null;
        try {
            LocalDate datePlacedOnTheRoadBus = LocalDate.of(2023, 3, 1);   
            bus = new Bus("Flixbus", "EXTRAURBANO", "04", datePlacedOnTheRoadBus,60);                
            vehiclePark.addVehicle(bus);  
            
        } catch(UnfeasableOperationException ex){
            System.out.println(ex.getMessage());  
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }          
             
        // --> Track <--
        Track track = null;
        try {
            LocalDate datePlacedOnTheRoadTrack = LocalDate.of(2023, 3, 1);   
            track = new Track("Iveco", "AUTOCARRO", "05", datePlacedOnTheRoadTrack,40);     
            vehiclePark.addVehicle(track);  
            
        } catch (UnfeasableOperationException ex){
            System.out.println(ex.getMessage());  
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }           

        // Si stampa il Parco Veicoli contenente tutti i Veicoli posseduti dall'Azienda    
        System.out.println("La Lista dei Veicoli contenente tutti i Veicoli posseduti dall'Azienda di Noleggi è: ");
        vehiclePark.getListVehicle().forEach(System.out::println); 
                
        // Si Instanzia l'oggetto Parco Veicoli Noleggiati dell'Azienza  
        RentalVehiclePark rentalVehiclePark = new RentalVehiclePark();
        
        // Dei Veicoli contenuti nel Parco Veicoli i seguenti sono attualmente Noleggiati:
        
        // --> Auto <--
     
        // Si Aggiungono i Veicoli al Parco Veicoli Noleggiati        
        LocalDate startDate = LocalDate.parse("2023-03-05", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate endDate = LocalDate.parse("2023-03-10", DateTimeFormatter.ISO_LOCAL_DATE);          
        long rentalPeriod = startDate.until(endDate,ChronoUnit.DAYS);                    
        RentalUser rentalUser = new RentalUser("Mario Rossi", "Catania", "mario.rossi@gmail.com", "ABCD1234");               
        Noleggio noleggio = new Noleggio(rentalPeriod, rentalUser, 0);         
        RentalVehicle rentalCar = new RentalVehicle(car, noleggio);
        double rentalTotalCost = rentalCar.calculateTotalCost(rentalPeriod);       
        noleggio.setRentalTotalCost(rentalTotalCost);
        
        rentalVehiclePark.addRentalVehicle(rentalCar);
                                     
        // Si stampa il Parco Veicoli Noleggiati contenente tutti i Veicoli Noleggiati posseduti dall'Azienda 
        System.out.println("\nLa Lista dei Veicoli contenente tutti i Veicoli posseduti dall'Azienda di Noleggi attualmente Noleggiati è: ");
        rentalVehiclePark.getRentalVehicleList().forEach(System.out::println); 
              
        System.out.println("\nFine Programma!");
    }
    
}
