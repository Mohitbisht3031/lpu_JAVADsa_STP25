package Day6;

public class Q1 {
    int adjDiff(int arr[]){
        int maxi = -999999;
        for(int i = 0 ;i<arr.length;i++){
            maxi = Math.max(maxi, Math.abs(arr[i] - arr[(i+1)%arr.length]));
        }
        return maxi;
    }
}
