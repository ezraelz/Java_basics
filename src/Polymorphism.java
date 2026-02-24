public class Polymorphism {
    public void greeting(){
        System.out.println("Hello there");
    }
}

class person extends Polymorphism {
    @Override
    public void greeting(){
        System.out.println("Hello there peoples");
    }
}

class Kids extends Polymorphism {
    @Override
    public void greeting(){
        System.out.println("Hello there kids!");
    }
}

