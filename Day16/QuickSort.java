package Day16;

public class QuickSort {

    int checkP(int arr[],int s,int e){
        int ele = arr[s];
        int c = 0;
        for(int i =s+1;i<=e;i++){
            if(arr[i]< ele)c++;
        }
        arr[s] = arr[s+c];
        arr[s+c] = ele;

        int i = s;
        int j = e;
        while(i <= s+c && j>= s+c){
            if(arr[i] > arr[s+c] && arr[j] <= arr[s+c]){
                swap(arr[i],arr[j]); // logic
            }else if(arr[j] > arr[s+c])j--;
            else i++;
        }

        return s+c;
    }

    void quickSort(int arr[],int s,int e){
        if(s >= e)return;
        int pi = checkP(arr,s,e);
        quickSort(arr, s, pi);
        quickSort(arr, pi+1, e);
    }
}
