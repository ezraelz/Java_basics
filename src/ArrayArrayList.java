// ===========================
// Array and ArrayList methods
// ===========================
public class ArrayArrayList {
    public void example(){
        String[] roles = {"admin", "supervisor", "user"};
        for(int r=0; r < roles.length; r++){
            System.out.println(roles[r]);
        }
        for(String role : roles){
            System.out.println(role);
        }

    }
}
