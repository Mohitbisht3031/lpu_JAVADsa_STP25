package Day10;

class Record<E,K>{
    E arr[];

    E get(int i){
        return arr[i];
    }
    K convert(){
        K a;
        return a;
    }
}

public class genrics {
    public static void main(String[] args) {
        Record<Integer,String> r = new Record();
    }
}
