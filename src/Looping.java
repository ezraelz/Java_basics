// ===========================
// Loops and examples
// ===========================

public class Looping {
    public void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }

    public int whilelooping(){
        int count = 1;

        while(count <= 5){
            System.out.print("\nCount" + count);
            count++;
        }
        return count;
    };
    public void dolooping(){
        int x = 0;
        do { 
            System.out.println(x);
            x++;
        } while (x < 3);
    }

    void arrayLooping(){
        String[] users = {"adam", "lukas", "meron"};
        for (String name : users){
            if (name == "meron"){
            continue;
            }
            System.out.println(name);

        }
    }

    void evenumbers(){
        for (int n = 0; n < 20; n++){
            System.out.println(n);
            n++;
        }
    }
    void oddnumbers(){
        for (int n = 1; n < 20; n++){
            System.out.println(n);
            n++;
        }
    }

}
