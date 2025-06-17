package Day9;

public class Q1 {
    
    int maxDifference(int arr[]){
        int maxi = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    maxi = Math.max(maxi, arr[j]-arr[i]);
                }
            }
        }
        return maxi;
    }
}
