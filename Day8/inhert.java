package Day8;

class Animal{
    public void speak(){
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal{
    public void speak(){
        System.out.println("Dog barks");
    }
}

public class inhert {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.speak();
    }
}
