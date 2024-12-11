// PACKAGE
package edu.unict.oop.interfaces;

// IMPORT
import edu.unict.oop.exceptions.OvershareException;

public interface Sharable {
    
    // COSTANTI
    int MAXSHARING = 2;

    void share() throws OvershareException;
    void unshare();
    int getSharing();

}
