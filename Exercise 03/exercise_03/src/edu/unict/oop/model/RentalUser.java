// PACKAGE
package edu.unict.oop.model;

public class RentalUser {
    
    // ATTRIBUTI
    private final String name;
    private final String residence;
    private final String email;
    private final String taxID;
    
    // COSTRUTTORI
    public RentalUser(String name, String residence, String email, String taxID) {
        this.name = name;
        this.residence = residence;
        this.email = email;
        this.taxID = taxID;
    }
    
    // GETTER
    public String getName() {
        return name;
    }

    public String getResidence() {
        return residence;
    }

    public String getEmail() {
        return email;
    }

    public String getTaxID() {
        return taxID;
    }
    
    // toString
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", residence=" + residence 
                       + ", email=" + email + ", taxID=" + taxID + '}';
    }
    
}
