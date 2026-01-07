// ==================================
// Methods, parameters and arguments
// ==================================

import java.util.Scanner;
public class Methods {
    // java's way to take an input from the user
    Scanner scanner = new Scanner(System.in);

    // void method returns nothing
    void greeting(){
        System.out.print("Hello there!");
    }

    // Returns string
    String greet(String name){
        System.out.println("Hello " + name);
        return name;
    }
    String greetwPrompt(){
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
        return name;
    }

    void multiplication(double a, double b){
        System.out.println("Enter number one? ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter number two? ");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;
        System.out.println("The result is " + result);
        
    }

    // Returns boolean value
    boolean checkage(int age){
        System.out.println("Enter age: ");
        age = scanner.nextInt();
        if (age > 18){
            System.out.println("You are adult " + true);
        } else {
            System.out.println("You are not an adult " + false);
        }
        return true;
    }

}
