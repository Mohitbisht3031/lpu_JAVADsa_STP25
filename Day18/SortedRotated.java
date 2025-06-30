package Day18;

public class SortedRotated {
    boolean sortedRotated(int arr[],int t){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] == t)return true;
            if(arr[mid] > arr[s]){
                if(arr[s] <= t && t < arr[mid]){
                    e = mid-1;
                }else s = mid+1;
            }else{
                if(arr[mid] < t && t >= arr[e]){
                    s = mid+1;
                }else e = mid-1;
            }
        }
        return false;
    }
}
