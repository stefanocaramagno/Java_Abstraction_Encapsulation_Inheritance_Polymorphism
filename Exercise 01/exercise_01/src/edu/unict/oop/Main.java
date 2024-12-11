// PACKAGE
package edu.unict.oop;

// IMPORT
import edu.unict.oop.enumarations.Flour;
import edu.unict.oop.enumarations.Supplement;
import edu.unict.oop.enumarations.Size;
import edu.unict.oop.model.BottledDrink;
import edu.unict.oop.model.Delivery;
import edu.unict.oop.model.DraftDrink;
import edu.unict.oop.model.EditablePizza;
import edu.unict.oop.model.Scontrino;
import edu.unict.oop.model.UneditablePizza;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inizio Programma\n");
 
        // Si instanziano le Lista delle Ordinazioni della Pizzeria        
        List listaOrdinazioniDaAsporto = new ArrayList();   
        List listaOrdinazioniInLoco = new ArrayList();          
            
        // ----> 1°ORDINAZIONE (In Loco) <----
        System.out.println("----> 1°ORDINAZIONE (In Loco) <----\n");
              
        // Ingredienti della Pizza Modificabile
        List<String> listaIngredientiPizzaEdit = new ArrayList<String>();
        listaIngredientiPizzaEdit.add("mozzarella");
        listaIngredientiPizzaEdit.add("pomodoro");      
        
        // Si instanzia la Lista dei Supplementi della Pizza Modificabile (inizialmente vuota)
        List<Supplement> listaSupplementi = new ArrayList<Supplement>(); 
        
        // Si instanzia la Pizza Modificabile        
        EditablePizza pizzaEdit = new EditablePizza("Margherita", listaIngredientiPizzaEdit, 0, Flour.GRANODURO, 1, listaSupplementi);

        // Si Visualizza la Pizza Modificabile 
        System.out.println("La PIZZA da mangiare in LOCO scelta è: ");
        System.out.println(pizzaEdit + "\n");   
        
        // Si Aggiunge qualche Supplemento alla Pizza Modificabile (di conseguenza il prezzo complessivo della pizza aumenta)
        pizzaEdit.addSupplement(Supplement.PROSCIUTTO);
        pizzaEdit.addSupplement(Supplement.PATATINE);    
        pizzaEdit.addSupplement(Supplement.WRUSTEL); 
        pizzaEdit.setPrice(pizzaEdit.calculatePrice());
       
        // Si Visualizza la Pizza Modificabile 
        System.out.println("La PIZZA da mangiare in LOCO (con supplementi aggiunti) è: ");       
        System.out.println(pizzaEdit + "\n");        
             
        // Si Rimuove un Ingrediente dalla Pizza Modificabile (il prezzo della pizza rimane comunque invariato)
        pizzaEdit.removeIngredient("mozzarella");
        
        // Si Visualizza la Pizza Modificabile 
        System.out.println("La PIZZA da mangiare in LOCO (con ingredienti eliminati e supplementi aggiunti) è: ");
        System.out.println(pizzaEdit + "\n");   
     
        // Si Instanzia la Bibita In Brocca        
        DraftDrink draftDrink1 = new DraftDrink("Acqua", "Blues", 2, 1, 0, 1);       
        
        // Si Calcola il Prezzo della Bibita In Brocca  
        draftDrink1.setPrice(pizzaEdit.calculatePrice());       
          
        // Si Visualizza la Bibita In Brocca
        System.out.println("La BIBITA IN BROCCA da bere In Loco scelta è: ");       
        System.out.println(draftDrink1 + "\n");       
        
        // Si Instanzia la Bibita Imbottigliata        
        BottledDrink bottledDrink1 = new BottledDrink("Birra", "Peroni", 2, Size.MEDIA, 1);       
        
        // Si Visualizza la Bibita Imbottigliata 
        System.out.println("La BIBITA IMBOTTIGLIATA da bere In Loco scelta è: ");       
        System.out.println(bottledDrink1 + "\n");  
       
        
        // ----> 1°ORDINAZIONE  (Da Asporto) <----       
        System.out.println("\n----> 1°ORDINAZIONE (Da Asporto) <----\n");
        
        // Ingredienti della Pizza Non Modificabile
        List<String> listaIngredientiPizzaNonEdit = new ArrayList<String>();
        listaIngredientiPizzaNonEdit.add("uovo");
        listaIngredientiPizzaNonEdit.add("wrustel");       
        listaIngredientiPizzaNonEdit.add("funghi");        
        
        // Si instanzia un Destinatario della Pizza Non Modificabile
        Delivery delivery = new Delivery("Mario","Via Italia 30", true);
       
        // Si instanzia la Pizza Non Modificabile        
        UneditablePizza pizzaNonEdit = new UneditablePizza("Capricciosa", listaIngredientiPizzaNonEdit, 0, Flour.RUSELLO, delivery);       
        
        // Si Calcola il Prezzo della Non Pizza Modificabile 
        pizzaNonEdit.setPrice(pizzaNonEdit.calculatePrice());
        
        // Si Visualizza la Pizza Non Modificabile 
        System.out.println("La PIZZA da mangiare Da ASPORTO scelta è: ");
        System.out.println(pizzaNonEdit + "\n");
              
        // Si Instanzia la Bibita Imbottigliata        
        BottledDrink bottledDrink2 = new BottledDrink("Acqua", "Cavagrande", 3, Size.GRANDE, delivery);       
        
        // Si Visualizza la Bibita Imbottigliata 
        System.out.println("La BIBITA IMBOTTIGLIATA da bere Da ASPORTO scelta è: ");       
        System.out.println(bottledDrink2 + "\n");  
       

        // ----> CONCLUSIONI <----       
        System.out.println("\n----> CONCLUSIONI <----\n");
        
        // Si aggiungono le Ordinazioni In Loco fatte in precedenza nella Lista delle Ordinazioni apposita della Pizzeria  
        listaOrdinazioniInLoco.add(pizzaEdit);
        listaOrdinazioniInLoco.add(draftDrink1);
        listaOrdinazioniInLoco.add(bottledDrink1);
        
        // Si aggiungono le Ordinazioni Da Asporto fatte in precedenza nella Lista delle Ordinazioni apposita della Pizzeria        
        listaOrdinazioniDaAsporto.add(pizzaNonEdit);
        listaOrdinazioniDaAsporto.add(bottledDrink2);
        
        System.out.println("La Lista delle Ordinazioni In Loco è: ");
        listaOrdinazioniInLoco.forEach(System.out::println); 
        
        System.out.println("\nLa Lista delle Ordinazioni Da Asporto è: ");      
        listaOrdinazioniDaAsporto.forEach(System.out::println);  
        
        
        // ----> SCONTRINO DI "1°ORDINAZIONE  (Da Asporto)  <----            
        Scontrino scontrino = new Scontrino();
        scontrino.addProduct(pizzaNonEdit);
        scontrino.addProduct(bottledDrink2);
        double totalCost = scontrino.getTotal();
        System.out.println("\nIl Costo Totale per l'Ordinazione Da Asporto del cliente " + delivery.getName() + " è " + totalCost + " Euro");

         
        System.out.println("\nFine Programma");       
    }
    
}
