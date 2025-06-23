package Day13;

public class Q1 {
    int removeVal(int arr[],int val){
        int c = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == val)c++;
            else arr[i-c] = arr[i];
        }
        return arr.length - c;
    }
}
