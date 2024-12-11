// PACKAGE
package edu.unict.oop.model;

// IMPORT
import java.time.LocalDate;

public class Loan {
    
    // ATTRIBUTI
    private final User user;
    private final LocalDate startDate;
    private final LocalDate dueDate;

    // COSTRUTTORI
    public Loan(User user, LocalDate startDate, LocalDate dueDate) {
        this.user = user;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }
    
    // GETTER
    public User getUser() {
        return user;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
    
    // toString
    @Override
    public String toString() {
        return "Loan{" + "user=" + user + ", startDate=" + startDate + ", dueDate=" + dueDate + '}';
    }

}
