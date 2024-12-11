// PACKAGE
package edu.unict.oop.exceptions;

// IMPORT
import edu.unict.oop.interfaces.Loanable;

public class LoanException extends Exception {
    
    // ATTRIBUTI
    Loanable loanable;

    public LoanException() {
        super("LoanException raised");
    }

    public LoanException(String message) {
        super(message);
    }

    public LoanException(Loanable loanable) {
        super("exception: book " + loanable.toString() + "already lend");
        this.loanable=loanable;
    }

    public Loanable getLoanable() {
        return loanable;
    }
}
