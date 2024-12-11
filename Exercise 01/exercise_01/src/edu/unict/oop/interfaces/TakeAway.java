// PACKAGE
package edu.unict.oop.interfaces;

// IMPORT
import edu.unict.oop.model.Delivery;

public interface TakeAway {
    Delivery getDelivery();
    void setDelivery(Delivery delivery);

    public double calculatePrice();
}
