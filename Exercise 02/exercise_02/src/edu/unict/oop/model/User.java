// PACKAGE
package edu.unict.oop.model;

public class User {
    
    // ATTRIBUTI
    private final String name;
    private final int id;
    private final BookShelf shelf;

    // COSTRUTTORI
    public User(String name, int id) {
        this.name = name;
        this.id = id;
        shelf= new BookShelf();
    }

    // GETTER
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public BookShelf getShelf() {
        return shelf;
    }
    
    // toString
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", id=" + id + ", shelf=" + shelf + '}';
    }

}