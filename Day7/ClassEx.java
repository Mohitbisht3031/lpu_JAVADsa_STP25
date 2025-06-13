package Day7;

final class Animal{
    void speak(){
        System.out.println("Animal speaks");
    }
}

public class ClassEx {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();
    }
}
