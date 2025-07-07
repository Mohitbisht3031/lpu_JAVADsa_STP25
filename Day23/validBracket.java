package Day23;

import java.util.Stack;

public class validBracket {
    boolean valid(String str){
        Stack<Character>stk = new Stack<>();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stk.push(str.charAt(i));
            }else{
                if(!stk.empty()){
                    if(check(stk.peek(),str.charAt(i)))stk.pop();
                    else return false;
                }else return false;
            }
        }

        return stk.empty();
    }
}
