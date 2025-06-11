package Day5;

public class moveZero {
    int[] moveZero(int arr[]){
        int narr[] = new int[arr.length];
        int j = 0;
        for(int  i =0;i<arr.length;i++){
            if(arr[i] != 0){
                narr[j++] = arr[i];
            }
        }
        return narr;
    }

    int[] moveZeroNew(int arr[]){
        int c = 0;
        for(int i = 0;i<arr.length;i++){
            c+=(arr[i] == 0 ? 1 : 0);
            if(arr[i] != 0)arr[i-c] = arr[i];
        }
        for(int i = arr.length-c;i<arr.length;i++)arr[i] = 0;
        return arr;
    }


}
