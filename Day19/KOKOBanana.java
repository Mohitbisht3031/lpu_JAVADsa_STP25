package Day19;

public class KOKOBanana {
    boolean check(int s,int arr[],int h){
        int t = 0;
        for(int i = 0;i<arr.length;i++){
            t+=(arr[i]/s);
            if(t > h)return false;
        }
        return true;
    }
    int minSpeed(int arr[],int h){
        int e = 0;
        for(int i = 0;i<arr.length;i++)e+=arr[i];
        int s = 1;
        int ans = -1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(check(mid,arr,h)){
                ans = mid;
                e = mid-1;
            }else s = mid+1;
        }
        return ans;
    }
}
