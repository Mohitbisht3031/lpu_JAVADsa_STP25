package Day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer>lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(3);

        System.out.println(hs.size());
        System.out.println(hs);
        Iterator it =  hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        if(hs.contains(2))System.out.println("yes it contains 2");
        hs.remove(3);
        System.out.println(hs);
    }
}
