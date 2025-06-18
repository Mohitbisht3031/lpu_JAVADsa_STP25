package Day10;

public class Q1 {
    int maxiDiff(int arr[]){
        int mini = arr[0];
        int maxi = 0;
        for(int i = 1;i<arr.length;i++){
            maxi = Math.max(maxi , arr[i] - mini);
            mini = Math.min(mini, arr[i]);
        }
        return maxi;
    }
}
