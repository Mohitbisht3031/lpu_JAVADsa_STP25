package Day25;

import java.util.LinkedList;
import java.util.Queue;

public class stack {
    Queue<Integer>q=new LinkedList<>();
    // tack(){
    //     this.q = new Queue<Integer>();
    // }

    void push(int e){
        q.add(e);
    }
    int pop(){
        if(q.size() == 0)return -1;
        int s = q.size();
        for(int i = 0;i<s-1;i++){
            int f = q.poll();
            q.add(f);
        }
        return q.poll();
    }

    int front(){
        if(q.size() == 0)return -1;
        int s = q.size();
        for(int i = 0;i<s-1;i++){
            int f = q.poll();
            q.add(f);
        }
        int e = q.poll();
        q.add(e);
        return e;
    }

}
