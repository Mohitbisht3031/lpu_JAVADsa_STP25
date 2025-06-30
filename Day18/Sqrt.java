package Day18;

public class Sqrt {
    // Binary search approach
    int sqrt(int x){
        if(x <= 3)return 1;
        int lb = 1;
        int ub = x/2;
        int ans = -1;
        while(lb <= ub){
            int mid = lb+(ub-lb)/2;
            if(mid*mid == x){
                return mid;
            }else if(mid*mid < x){
                ans = mid;
                lb = mid+1;
            }else ub = mid-1;
        }
        return ans;
    }
}
