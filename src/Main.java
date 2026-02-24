// ===========================================================
// In Java All methods and objects belongs to the main method
// ===========================================================

public class Main {
    // This public method implies that any object or method is accessible 
    // from any document inside src
    // Any document can access this public object
    public static void main(String[] args){
        // New instance of calculator object
        Calculator calculator = new Calculator();

        // New instance of looping object
        Looping looping = new Looping();

        // New instance of method object
        Methods method = new Methods();

        // New instance of user object
        Objects user = new Objects();
        // Accessing the properties of the user object

        // New instance of ArrayArrayList object
        ArrayArrayList arraylist = new ArrayArrayList();

        // New instance of encapsulation
        Encapsulation encapsulation = new Encapsulation();

        // New instance of polymorphism
        Polymorphism poly = new Kids();

        Electronics product = new Electronics(1, "new", 50);
        product.setName("New");
        product.getName();
        product.getDescription();
        System.out.println(product.getDescription());
    }   
}