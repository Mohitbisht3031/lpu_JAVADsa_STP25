package Day19;

public class minWtCapacity {
    boolean check(int mWt,int wt[],int D){
        int d= 1;
        int w = 0;
        for(int i = 0;i<wt.length;i++){
            if(w+wt[i] > mWt){
                d++;
                w = wt[i];
            }else{
                w+=wt[i];
            }
        }
        return d <= D;
    }
    int minWeightCap(int wt[],int D){
        int s = 0;
        int e = 0;
        for(int ele : wt){
            e+=ele;
            s = Math.max(s, ele);
        }
        int ans = -1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(check(mid,wt,D)){
                ans = mid;
                e = mid-1;
            }else s = mid+1;
        }
        return ans;
    }
}
