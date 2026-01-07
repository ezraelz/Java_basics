// ===================================================
// All methods and objects belongs to the main method
// ===================================================

public class Main {
    public static void main(String[] args){
        // New instance of calculator object
        Calculator calculator = new Calculator();

        // New instance of looping object
        Looping looping = new Looping();

        // New instance of method object
        Methods method = new Methods();

        // New instance of user object
        User user = new User("jack", 10, "student");
        // Accessing the properties of the user object
        user.printProfile();

        // New instance of ArrayArrayList object
        ArrayArrayList arraylist = new ArrayArrayList();
    }
}