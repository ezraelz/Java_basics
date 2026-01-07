// ===================================================
// Calculator example using scanner and switch methods
// ===================================================

import java.util.Scanner;

public class Calculator {
    // This void type doesn't for any function to return any specific data type
    public void main(String[] args) {

        // Scanner java's way to propt or take an input from the user
        Scanner scanner = new Scanner(System.in);

        // System.out.print() method is the equivalent to print() method in python
        // Which displays the out put
        System.out.println("Choose an operation");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Division");
        System.out.println("4 for Multiplication");

        // This is how we declare a variable in java
        // First specify the data type 
        // Then specify the name for the variable
        // Finaly assign it to a value
        // Variable is declared here that has the data type of integer 
        int choice = scanner.nextInt(); 
        // scanner.nextInt() implies to the input and type of input accepted from the user
        System.out.println("Enter number one: ");
        
        // A double or decimal data type variable
        double num1 = scanner.nextDouble();
        System.out.println("Enter number two: ");
        double num2 = scanner.nextDouble();

        double result;
        // Switch method is the best use case scenario for conditional statements
        switch(choice){
            case 1: result = num1 + num2;
                    System.out.print("The result is " + result);
                    break;
            case 2: result = num1 - num2;
                    System.out.print("The result is " + result);
                    break;
            case 3: 
                    if (num2 == 0) {
                        System.out.println("Invalid argument try again!!");
                        break;
                    } else {
                        result = num1 / num2;
                        System.out.print("The result is " + result);
                        break;
                    }
            case 4: result = num1 * num2;
                    System.out.print("The result is " + result);
                    break;
            default: System.out.print("Invalid choice try again!");
                    break;
        }
        scanner.close();
    }
}
