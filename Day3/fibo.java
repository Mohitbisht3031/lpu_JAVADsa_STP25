package Day3;

public class fibo {
    int fib(int n){
        int a = 0;
        int b = 1;
        for(int i = 3;i<=n;i++){
            int c = a+b;
            a = b;
            b = c;
        }
        return b;
    }

    // recurive
    int fibRec(int n){
        if( n == 1)return 0;
        if(n == 2)return 1;
        
        int ans1 = fibRec(n-1);
        int ans2 = fibRec(n-2);

        return ans1+ans2;
    }
}
