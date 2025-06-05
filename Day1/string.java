package Day1;

public class string {
    // to get the max of 2 numbers
    int max(int a,int b){
        return (a > b ? a : b);
    }

    /*
     * Mehtod overloading 
     * help us to create a multiple methods with same method sign
     * but different no. of args or different type of args
     */
    int max(int a,int b,int c){
        return max(a, max(b, c));
    }
    int max(int a,int b,int c,int d){
        return max(a, b,max(c,d));
    }
    // this is how we make a var arg
    int maxV(String str, double d,int... v){ 
        return 0;
    }
    public static void main(String[] args) {
        String str = "Mohit";
        String str2 = "mohit";
        if(str.equalsIgnoreCase(str2)){
            System.out.println("same");
        }else System.out.println("not same");
    }
}
