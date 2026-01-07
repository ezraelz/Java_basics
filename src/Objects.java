// ===========================
// Object and object methods example
// ===========================
import java.util.Scanner;

// This is example object in java
class Objects {
    // This are properties of the object
    String name;
    int age;
    String role;

    // This is how to initialize the properties of an object
    public void user(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    // This method accepts an input from the user
    // assign it to the object properties
    void addUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name: ");
        name = scanner.nextLine();
        System.out.println("Enter user age: ");
        age = scanner.nextInt();
        System.out.println("Enter user role: ");
        role = scanner.next();
        scanner.close();
    }

    // this methods returns the true or false value
    // checks the user is adult or not 
    public boolean isAdult() {
        return age >= 18;
    }

    // this methods returns the information stored
    // starts by runnig the adduser method first 
    // and displays the info
    public void printProfile() {
        addUser();
        System.out.println("---- USER PROFILE ----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("Adult: " + isAdult());
    }
}
