package Day17;

public class LastOccurance {
    int lastOccurance(int arr[],int t){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] == t){
                ans = mid;
                s = mid+1;
            }
            else if(arr[mid] > t){
                e = mid-1;
            }else s = mid+1;
        }

        return ans;
    }
}
