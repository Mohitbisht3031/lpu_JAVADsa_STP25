package Day23;

import java.util.Stack;

public class balanceParan {

    int BalanceParan(String str){
        Stack<Character>stk = new Stack<>();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '(')stk.push(str.charAt(i));
            else{
                if(!stk.empty() && stk.peek() == '(')stk.pop();
                else stk.push(str.charAt(i));
            }
        }

        int c = 0;
        while(!stk.empty()){
            char ch1 = stk.pop();
            char ch2 = stk.pop();
            if(ch1 == ch2)c++;
            else c+=2;
        }

        return c;
    }
    
}