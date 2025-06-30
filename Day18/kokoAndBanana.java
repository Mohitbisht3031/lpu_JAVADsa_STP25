package Day18;

public class kokoAndBanana {
    boolean check(int speed,int arr[],int h){
        // implement logic
    }
    // itrative approach -> HW convert it into a BS approach
    int minSpeed(int arr[],int h){
        int s = 0;
        for(int i = 0;i<arr.length;i++){
            s+=arr[i];
        }
        for(int i = 1;i<=s;i++){
            if(check(i,arr,h))return i;
        }
        return -1;
    }
}
