// PACKAGE
package edu.unict.oop.model;

public class Delivery {
    
    // ATTRIBUTI
    private final String name;
    private final String address;
    private final boolean speedy;
               
    // COSTRUTTORI            
    public Delivery(String name, String address, boolean speedy) {
        this.name = name;
        this.address = address;
        this.speedy = speedy;
    }
    
    // GETTER
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public boolean isSpeedy() {
        return speedy;
    }
    
    // toString
    @Override
    public String toString() {
        return "Delivery{" + "name=" + name + ", address=" + address + ", speedy=" + speedy + '}';
    }    
                
}
