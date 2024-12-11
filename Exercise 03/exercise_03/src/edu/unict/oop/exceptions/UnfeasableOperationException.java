// PACKAGE
package edu.unict.oop.exceptions;

public class UnfeasableOperationException extends Exception {
       
    public UnfeasableOperationException() {
        super("Impossible to perform the operation.");
    }

    public UnfeasableOperationException(String message) {
        super(message);
    }

}
