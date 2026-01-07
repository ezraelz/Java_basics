import java.util.Scanner;

public class Calculator {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Division");
        System.out.println("4 for Multiplication");

        int choice = scanner.nextInt();
        System.out.println("Enter number one: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter number two: ");
        double num2 = scanner.nextDouble();

        double result;
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
