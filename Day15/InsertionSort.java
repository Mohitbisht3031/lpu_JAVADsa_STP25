package Day15;

public class InsertionSort {
    int[] insertionSort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int k = arr[i];
            int j = i-1;
            while(j >= 0 && k < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = k;
        }
        return arr;
    }
}
