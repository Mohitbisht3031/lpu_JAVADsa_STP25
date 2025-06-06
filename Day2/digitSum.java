package Day2;

public class digitSum {
    int digitSumIterative(int n){
        int s = 0;
        while(n > 0){
            s+=(n%10);
            n/=10;
        }
        return s;
    }

    /*
     * 1. Base case
     * 2. Recursive call
     * 3. our part
     */
    int digitSumRec(int n){
        if(n == 0)return 0;
        int d = n%10;
        int s = digitSumRec(n/10);
        return s+d;
    }

}
