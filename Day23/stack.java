package Day23;
import Day20.LLnode;


public class stack {
    LLnode h;
    int s;
    stack(){
        this.h = null;
        this.s = 0;
    }

    public void push(int val){
        LLnode nn = new LLnode(val);
        if(h == null){
            h = nn;
        }else{
            nn.next = h;
            h = nn;
        }
        s++;
    }

    public int top(){
        if(h == null)return -1;
        return h.val;
    }

    public int pop(){
        if(h == null)return -1;
        int e = h.val;
        h = h.next;
        s--;
        return e;
    }

    public boolean isEmpty(){
        return s == 0;
    }

    public int size(){
        return s;
    }

}
