package Day25;

import java.util.Stack;

public class queue {
    Stack<Integer>s1;
    Stack<Integer>s2;
    queue(){
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    void push(int val){
        s1.push(val);
    }
    int front(){
        if(s1.empty() && s2.empty())return -1;
        if(s2.empty()){
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }
    int pop(){
        if(s1.empty() && s2.empty())return -1;
        if(s2.empty()){
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    int size(){
        return s1.size()+s2.size();
    }

}
