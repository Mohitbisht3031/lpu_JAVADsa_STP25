package Day29;

public class reduceTo1 {
    int helper(int n,int dp[]){
        if(n <= 1)return 0;
        if(dp[n] != -1)return dp[n];
        int r = Integer.MAX_VALUE;
        r = Math.min(r, helper(n-1, dp));
        if(n%2 ==0){
            r = Math.min(r,helper(n/2, dp));
        }
        if(n%3 == 0){
            r = Math.min(helper(n/3, dp), r);
        }
        return dp[n] = r+1;
    }
    int ReduceTo1(int n){
        if(n <= 1)return 0;
        int dp[] = new int[n+1];
        for(int i = 0;i<=n;i++)dp[i] = -1;
        helper(n,dp);
        return dp[n];
    }
}
