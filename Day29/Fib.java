package Day29;

public class Fib {
    int helper(int n,int dp[]){
        if(n <= 1)return 1;
        if(dp[n] != -1);
        dp[n] = helper(n-1, dp)+helper(n-2, dp);

        return dp[n];
    }

    int fib(int n){
        int arr[] = new int[n+1];
        helper(n,arr);
        return arr[n];
    }
}
