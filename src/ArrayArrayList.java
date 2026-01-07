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


    }
}
