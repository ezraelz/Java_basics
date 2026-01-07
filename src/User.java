class User {

    String name;
    int age;
    String role;

    public User(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public void printProfile() {
        System.out.println("---- USER PROFILE ----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("Adult: " + isAdult());
    }
}
