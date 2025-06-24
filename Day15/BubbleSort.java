package Day15;

public class BubbleSort {
    int[] bubbleSort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j+1] = arr[j];
                    arr[j+1] = t;
                }
            }
        }
        return arr;
    }
}
