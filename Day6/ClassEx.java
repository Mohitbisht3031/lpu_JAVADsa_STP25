package Day6;

class Animal{
    static int b =11;
    // int noOfLegs;
    // void Speak(){
    //     System.out.println("Animal speaks");
    // }
}

public class ClassEx {
    public static void main(String[] args) {
        Animal.b++;  
        Animal a = new Animal();
        System.out.println(a.b);
        // a.Speak();
        // a.noOfLegs = 10;
        // System.out.println(a.noOfLegs);
    }
}
