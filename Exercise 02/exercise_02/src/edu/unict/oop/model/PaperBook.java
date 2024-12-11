// PACKAGE
package edu.unict.oop.model;

// IMPORT
import edu.unict.oop.interfaces.Loanable;
import edu.unict.oop.exceptions.LoanException;
import java.time.LocalDate;

public class PaperBook extends Book implements Loanable {
    
    // ATTRIBUTI
    private Loan loan;

    // COSTRUTTORI
    public PaperBook(String title, String author, String isbn) {
        super(title, author, isbn);
    }
   
    // toString
    @Override
    public String toString() {
        return "PaperBook{" + "loan=" + loan + '}';
    }
   
    @Override
    public Loan getLoan() {
        return loan;
    }   
       
    @Override
    public void lend(User u, LocalDate startLoan, LocalDate endLoan) throws LoanException {
        if (this.loan != null) {
//          NOTICE different LoadException builder methods
//          throw new LoanException("Book already loaned");
//          throw new LoanException("Book "+ this.toString() + "already loaned");
            throw new LoanException(this);
        }
        this.loan = new Loan(u, startLoan, endLoan);
    }

    @Override
    public void revokeLoan() {
        this.loan = null;
    }

}
