// Abstract class and Inheritance example
// An abstract class is a class that cannot be instantiated and is meant to be subclassed. It can contain abstract methods, which are methods that are declared without an implementation and must be implemented by any subclass of the abstract class.
// Abstract classes are used to provide a common base class for other classes to inherit from and to define a common inherited interface for a group of related classes.
// Inheritance is a fundamental object-oriented programming concept that allows a new class (called a subclass or child class) to inherit properties and behaviors (fields and methods) from an existing class (called a superclass or parent class).
abstract class Products{
    // Properties of the products class
    // The protected access modifier allows the properties to be accessed by subclasses of the products class, but not by other classes that are not subclasses of the products class
    protected int id;
    protected String name;
    protected double price;

    // Constructor for the Products class
    // Constructors must have the same name as the class and do not have an return type(void, int, etc.)
    // The constructor is used to initialize the properties of the class when an object is created
    public Products(int id, String name, double price){
        this.id = id;
        this.price = price;
        this.name = name;
    }

    // Getter and setter methods for the name property
    public void setName(String name){
        this.name = name;
    }
    // Getter method only returns the value of the name property, it does not set or change the value of the name property
    // Getter methods are used to access the properties of the class from outside the class, while setter methods are used to modify the properties of the class from outside the class
    // Getter methods do not accept any parameters, while setter methods accept parameters that are used to set the values of the properties of the class
    public String getName(){
        return this.name;
    }

    // Abstract method that must be implemented by any subclass of products
    // Abstract methods are declared without an implementation and must be implemented by any subclass of the abstract class
    abstract String getDescription();
}


// Electronics class that extends the products class and implements the getDescription method
// The Electronics class inherits the properties and methods of the products class and must implement the getDescription method because it is an abstract method in the products class
class Electronics extends Products{

    // Constructor for the Electronics class that calls the constructor of the Procducts class using the super keyword to initialize the properites of the Electronics class
    public Electronics(int id, String name, double price){
        // The super keyword is used to call the constructor of the parent class (products class) to initialize the properties of the Electronics class that are inherited from the products class
        super(id, name, price);    
    }

    // Implementation of the getDescription method that returns a string description of the electronic product
    // The @Override annotation is used to indicate that the getDescription method is overriding the abstract method in the products class, it is not required but it is good practice to use it to avoid errors and improve code readability
    @Override
    public String getDescription(){
        return "Electronic item " + name;
    };
}