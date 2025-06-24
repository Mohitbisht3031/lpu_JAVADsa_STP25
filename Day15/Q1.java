package Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q1 {
    ArrayList<ArrayList<String>> anagrams(String arr[]){
        HashMap<String,ArrayList<String>>mp = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            char ch[] = arr[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!mp.containsKey(key))mp.put(key, new ArrayList<>());
            mp.get(key).add(arr[i]);
        }
        ArrayList<ArrayList<String>>ans = new ArrayList<>();
        for(String k : mp.keySet()){
            ans.add(mp.get(k));
        }
        return ans;
    }
}
