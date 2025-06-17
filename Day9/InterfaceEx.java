package Day9;

import javax.sound.midi.MetaMessage;

interface Mamel{
    void habitate();
    void speak();
}

@FunctionalInterface
interface Animal{
    void speak();
}

// achiving multiple inheritance using interfaces
class Dog implements Animal,Mamel{

    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    @Override
    public void habitate() {
       System.out.println("stays at home");
    }

}

class Cat implements Animal{

    @Override
    public void speak() {
        System.out.println("cat meowss");
    }
    
}

public class InterfaceEx {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.speak();

        // this is lamda expression
        Animal obj2 = () ->System.out.println("from the lambda expression of the FI");
        obj2.speak();

        // this is the use of anony classes
        Mamel m = new Mamel() {
            @Override
            public void speak() {
                System.out.println("from the speak of anonymus clas");
            };
            @Override
            public void habitate() {
                System.out.println("from the habitate of anony class");
            };
        };

        m.speak();
        m.habitate();
    }
}
