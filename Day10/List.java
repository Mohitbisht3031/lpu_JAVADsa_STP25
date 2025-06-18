package Day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        // array List and vector
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr.get(3));
        for(int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

        System.out.println("from the for each");
        for(var e : arr){
            // System.out.println("from the for each");
            System.out.println(e);
        }

        // LinkedList
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Mohit");
        ll.add("pranav");
        ll.add("amaan");
        ll.add("prachi");
        ll.add("deepak");

        ll.addFirst("Shruti");
        ll.addLast("Saket");

        System.out.println(ll.removeFirst());
        System.out.println(ll.getFirst());
        
        // Iterator<String> it = ll.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
    }
}
