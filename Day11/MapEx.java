package Day11;

import java.util.HashMap;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        
        hm.put("Mohit",    1);
        hm.put("Prachi",    2);
        hm.put("Pranav",    3);

        System.out.println(hm.get("Prachi"));
        hm.put("Prachi", 5);
        System.out.println(hm.get("Prachi"));
        if(hm.containsKey("Prana"))System.out.println("yes it conatins the key");

        for(String e : hm.keySet()){
            System.out.println("the key is "+e+" the value"+hm.get(e));
        }
        hm.remove("Mohit");
        System.out.println(hm);
    }
}
