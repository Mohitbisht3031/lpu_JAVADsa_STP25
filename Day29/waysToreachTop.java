package Day29;


public class waysToreachTop {
    // recursion with dp
    int helper(int n,int dp[]){
        if( n <= 3)return n;
        if(dp[n] != -1)return dp[n];

        int w1 = helper(n-1,dp);
        int w2 = helper(n-2,dp);
        int w3 = helper(n-3,dp);

        return dp[n] = w1+w2+w3;
    }

    // /RecursiveAction way approcah 
    int waysToreachTop(int n){
        if(n <= 3)return n;
        int w1 = waysToreachTop(n-1);
        int w2 = waysToreachTop(n-2);
        int w3 = waysToreachTop(n-3);
        return w1+w2+w3;
    }
}
