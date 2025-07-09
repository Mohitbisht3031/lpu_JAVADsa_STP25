package Day25;

import java.util.Stack;

public class reversePolish {
    String reversePolishNotation(String exp){
        Stack<Character>stk = new Stack<>();
        String op="+-*/^%";
        String ans = "";
        for(int i = 0;i<exp.length();i++){
            int ind =  op.indexOf(exp.charAt(i));
            if(exp.charAt(i) == '(' || ind != -1){
                if(ind != -1){
                    if(!stk.empty() && op.indexOf(stk.peek()) != -1){
                        //evaluate the prec.
                    } else stk.push(exp.charAt(i));
                }else stk.push(exp.charAt(i));
            }else{
                if(exp.charAt(i) == ')'){
                    while(!stk.empty() && stk.peek() != '('){
                        ans+=stk.pop();
                    }
                    stk.pop();
                }else ans+=exp.charAt(i);
            }
        }
        return ans;
    }
}
