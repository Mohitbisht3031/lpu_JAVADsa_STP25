package Day24;

import java.util.Stack;

public class IsRedundant {
    boolean redundantPair(String exp){
        Stack<Character>stk = new Stack<>();
        String ops = "+-*/%";
        for(int i = 0;i<exp.length();i++){
            if(exp.charAt(i) == '(' || ops.indexOf(exp.charAt(i), 0) == -1){
                stk.push(exp.charAt(i));
            }else{
                boolean f = false;
                while (!stk.empty() && stk.peek() != '(') {
                    f = true;
                    stk.pop();
                }
                if(!stk.empty())stk.pop();
                if(f == false)return true;
            }
        }
        return false;
    }
}
