// ====================
// Array and ArrayList
// ====================

import java.util.ArrayList;

public class ArrayArrayList {
    public void example(){
        // Array is fixed size
        // Array in java is immutable which means it cannot be modified
        // This array returns list of string elements

        String[] roles = {"admin", "supervisor", "user"};

        // Accessing an element
        // Returns the first element from the array
        System.out.print(roles[0]); // returns 'admin'

        // You can loop through arrays using for loop in two ways
        for(int r=0; r < roles.length; r++){
            System.out.println(roles[r]);
        }
        for(String role : roles){
            System.out.println(role);
        }

        // ArrayList is dynamic 
        // ArrayList can be modified 
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        // Prints the sum of the numbers inside the list
        int sum = 0;
        for(int num : numbers){
            // checks if the number is odd number
            if (num % 2 != 0){
                sum += num;
            }
        }
        System.out.print(sum);

    }
}
