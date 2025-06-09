package Day3;

public class fact {
    // Iterative
    int fact(int n){
        if( n <= 1)return 1;
        int ans = 1;
        for(int i = 2;i<=n;i++)ans*=i;
        return ans;
    }

    // Recursion
    int factRec(int n){
        if(n <= 1)return 1;
        int ans = fact(n-1);
        return ans*n;
    }

}
