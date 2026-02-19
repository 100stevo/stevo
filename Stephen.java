// Abstract class demonstrating Abstraction
public abstract class Person {

    // Encapsulation: protected attribute
    protected String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method (must be implemented by subclass)
    public abstract void displayDetails();
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stephen;

/**
 *
 * @author ADMIN
 */
public class Stephen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
