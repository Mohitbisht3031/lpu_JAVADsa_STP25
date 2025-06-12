package Day6;

// Non static inner classs
class A{
    int ov = 10;
    class InnerClass{
        void display(){
            ov++;
            System.out.println(ov);
        }
    }
}

// static inner class
class OC{
    private static int ov = 100;
    static class InnerC{
        void display(){
            ov++;
            System.out.println(ov);
        }
    }
}

// example of local inner class
class LocalOuter{
    void check(){
        class LocalInnerClass{
            void display(){
                System.out.println("from the display for local inner class");
            }
        }

        new LocalInnerClass().display();
    }
}

public class nestedClass {
    public static void main(String[] args) {
        A oc = new A();
        A.InnerClass ic = oc.new InnerClass();
        ic.display();

        OC.InnerC ic2 = new OC.InnerC();
        ic2.display();

        LocalOuter lo = new LocalOuter();
        lo.check();
    }
}
