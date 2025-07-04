package Day20;
import java.util.HashSet;
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

    public int len(LLnode h){
        if(h == null) return 0;
        int c = 0;
        LLnode t = h;
        while(t != null){
            c++;
            t = t.next;
        }
        return c;
    }

    public int lenRecursion(LLnode h){
        if(h == null)return 0;
        int l = lenRecursion(h.next);
        return l+1;
    }

    public LLnode reverseRec(LLnode h){
        if(h == null || h.next == null)return h;
        LLnode nh = reverseRec(h.next);
        LLnode t = h.next;
        t.next = h;
        h.next = null;
        return nh;
    }

    public LLnode reverseIterative(LLnode h){
        if(h == null || h.next == null)return h;
        LLnode prev = null;
        LLnode c = h;
        LLnode n = h.next;
        while (c != null) {
            c.next = prev;
            prev =c;
            c = n;
            if(n != null)n = n.next;
        }

        return prev;
    }

    public LLnode middleNode(LLnode h){
        if(h == null || h.next == null)return h;
        LLnode s = h;
        LLnode f = h;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    public boolean haveCycle(LLnode h){
        if(h == null || h.next == null)return false;
        HashSet<LLnode> st = new HashSet<>();
        LLnode t = h;
        while(t != null){
            if(st.contains(t))return true;
            st.add(t);
            t = t.next;
        }
        return false;
    }

    public boolean haveCycleOpti(LLnode h){
        if(h == null | h.next == null)return false;
        LLnode f = h;
        LLnode s = h;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
            if(s == f)return true;
        }
        return false;
    }

    public LLnode cycleStart(LLnode h){
        if(h == null || h.next == null)return null;
        LLnode s = h;
        LLnode f = h;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
            if(f == s)break;
        }

        LLnode ans = null;
        if(f == s){
            s = h;
            while(s != f){
                s = s.next;
                f = f.next;
            }
            ans = s;
        }

        return ans;
    }

}
