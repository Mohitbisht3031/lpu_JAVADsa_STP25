package Day11;

import java.util.ArrayList;
import java.util.Collections;

public class Q1 {
    ArrayList<Integer> plusOne(ArrayList<Integer>arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int c = 1;
        for(int i = arr.size()-1;i>=0;i--){
            int ds = arr.get(i) + c; // -> <= 9 or 10
            int d = ds%10; // 9
            c = ds/10; // 0
            ans.add(d);
        }

        if(c > 0){
            ans.add(c);
        }
        Collections.reverse(ans); // custom method to do the reverse
        return ans;
    }
}
