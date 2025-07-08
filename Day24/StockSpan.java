package Day24;

import java.util.Stack;

public class StockSpan {
    int[] stockSpan(int stock[]){
        Stack<Integer>stk = new Stack<>();
        int span[] = new int[stock.length];
        span[0] =1;
        stk.push(0);
        for(int i = 1;i<stock.length;i++){
            while(!stk.empty() && stock[stk.peek()] < stock[i])stk.pop();
            span[i] = (stk.empty() ? i+1 : i - stk.peek());
            stk.push(i);
        }
        return span;
    }
}
