package Day24;
import Day20.LLnode;

public class QueueUsingLL {
    LLnode h;
    LLnode t;
    int s;
    QueueUsingLL(){
       this.h = null;
       this.t = null;
       this.s = 0; 
    }

    void push(int val){
        LLnode nn = new LLnode(val);
        if(h == null){
            h = nn;
        }else{
            t.next = nn;
            t = nn;
        }
        s++;
    }

    int pop(){
        if(h == null)return -1;
        int e = h.val;
        h = h.next;
        s--;
        return e;
    }

    int front(){
        if(h == null)return -1;
        return h.val;
    }
    int size(){
        return s;
    }
    boolean isEmpty(){
        return s == 0;
    }
}
