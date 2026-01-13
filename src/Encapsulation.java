public class Encapsulation{
    // only visible to this class
    // hidden elements
    private String name = "Mike";
    private int age = 10;

    // setter example
    public void setName(String name){
        this.name = name;
    }
    // getter example
    public String getName(String name){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(int age){
        return age;
    }

    public void getUserInfo(){
        System.out.println("Username " + name);
        System.out.println("Age " + age);
    }
}