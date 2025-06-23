package Day13;

import java.util.ArrayList;

public class Q2 {
    boolean checkAna(String s1,String s2){
        int freq[] = new int[26];
        for(int i = 0;i<s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
        }
        for(int i = 0;i<s2.length();i++){
            freq[s1.charAt(i) - 'a']--;
        }
        for(int i = 0;i<26;i++){
            if(freq[i] != 0)return false;
        }
        return true;
    }
    ArrayList<ArrayList<String>> anagrams(String words[]){
        ArrayList<ArrayList<String>>ans = new ArrayList<ArrayList<String>>();
        int vis[] = new int[words.length];
        for(int i = 0;i<words.length;i++){
            if(vis[i] == 1)continue;
            ArrayList<String>arr = new ArrayList<>();
            arr.add(words[i]);
            vis[i] = 1;
            for(int j = i+1;j<words.length;j++){
                if(checkAna(words[i],words[j])){
                    vis[j] = 1;
                    arr.add(words[j]);}
            }
            ans.add(arr);
        }
        return ans;
    } 
}
