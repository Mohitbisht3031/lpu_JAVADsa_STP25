package Day2;

public class reverseNumber {
    int reverseNumberIterative(int n){
        int rev = 0;
        while(n > 0){
            int d = n%10;
            rev*=10;
            rev+=d;
            n/=10;
        }
        return rev;
    }
    
    int reverseNumberRec(int n,int rev){
        if(n == 0)return rev;
        rev*=10;
        rev+=(n%10);
        return reverseNumberRec(n/10, rev);
    }

}
