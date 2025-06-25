package Day16;

public class MergeSort {
    int[] merge(int arr1[],int arr2[],int s,int e){
        if(s >= e)return arr1;
        int mid = s+(e-s)/2;
        int i = 0;
        int j = mid+1;
        int arr[] = new int[(e-s)+1];
        int k = 0;
        while(i <= mid && j<=e){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            }else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i <= mid){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j <= e){
            arr[k] = arr2[j];
            k++;
            j++;
        }

        return arr;
    }

    int[] mergeSort(int arr[],int s,int e){
        if(s >= e)return arr;
        int mid = s+(e-s)/2;

        int arr1[] = mergeSort(arr, s, mid);
        int arr2[] = mergeSort(arr, mid+1, e);

        arr = merge(arr1,arr2,s,e);
        return arr;
    }
}
