package Day20;
import java.util.Scanner;

import Day20.LLnode;

public class LL {
    public LLnode make(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        LLnode h = null;
        LLnode t = null;
        while (val != -1) {
            if(h == null){
                h = new LLnode(val);
                t = h;
            }else{
                t.next = new LLnode(val);
                t = t.next;
            }
            val = sc.nextInt();
        }

        sc.close();
        return h;
    }

    public void print(LLnode h){
        if(h == null)return;
        LLnode t = h;
        while(t != null){
            System.out.print(t.val+"->");
            t = t.next;
        }
        System.out.println("null");
        return;
    }

    LLnode insertAtLast(LLnode h,int val){
        if(h == null)return new LLnode(val);
        if(h.next == null){
            h.next = new LLnode(val);
            return h;
        }
        LLnode t = h;
        while(t.next == null){
            t = t.next;
        }
        t.next = new LLnode(val);
        return h;
    }

    LLnode insertAtKthInd(LLnode h,int val,int ind){
        if(h == null)return h;
        if(ind == 1){
            LLnode nh = new LLnode(val);
            nh.next = h;
            h = nh;
            return h;
        }
        int i = 1;
        LLnode t = h;
        while(t != null && i < ind-1){
            t = t.next;
            i++;
        }
        if(t != null){
            LLnode n = t.next;
            t.next = new LLnode(val);
            t = t.next;
            t.next = n;
        }
        return h;
    }

}
