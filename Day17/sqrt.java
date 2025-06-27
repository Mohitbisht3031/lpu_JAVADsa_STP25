package Day17;

public class sqrt {
    // linear 
    int Sqrt(int x){
        if(x <= 3)return 1;
        int ans = -1;
        for(int i = 1;i<=x/2;i++){
            if((i*i) > x){
                break;
            }
            ans = i;
        }
        return ans;
    }
}
