package Day22;

import java.util.ArrayList;

public class stack {
    private ArrayList<Integer> arr;
    public stack(){
        arr = new ArrayList<>();
    }
    public void push(Integer a){
        arr.add(a);
    }
    public int pop(){
        if(arr.size() == 0)return -1;
        int e = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return e;
    }

    public int top(){
        if(arr.size() == 0)return -1;
        return arr.get(arr.size()-1);
    }

    public boolean isEmpty(){
        return arr.size() == 0;
    }

}
