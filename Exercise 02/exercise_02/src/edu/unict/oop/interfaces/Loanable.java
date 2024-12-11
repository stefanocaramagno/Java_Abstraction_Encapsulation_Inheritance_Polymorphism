// PACKAGE
package edu.unict.oop.interfaces;

// IMPORT
import edu.unict.oop.exceptions.LoanException;
import edu.unict.oop.model.Loan;
import edu.unict.oop.model.User;
import java.time.LocalDate;

public interface Loanable {
    void lend(User u, LocalDate startLoan, LocalDate endLoan) throws LoanException;
    void revokeLoan();
    Loan getLoan();
}
