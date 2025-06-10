package Day4;

public class rotate {
    int[] rotate(int arr[]){
        int l = arr[arr.length-1];
        for(int i = arr.length-1;i>=0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = l;
        return arr;
    }
    int[] rotate(int arr[],int r){
        int narr[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            narr[(i+r)%arr.length] = arr[i];
        }
        return narr;
    }
}
