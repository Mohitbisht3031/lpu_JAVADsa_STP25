package Day7;

abstract class Animal{
    private int noOflegs;
    // in order to achive a abstract class we need to have an abstract method in that class
    /*
     * in order to make an abstract method we have to declare a method with only
     * it's signature and not give it's defination
     */
    abstract void speak();

    int getLegs(){
        return noOflegs;
    }
}

public class AbstractionEx {
    
}
