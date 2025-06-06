package Day2;

public class noOfDigit {
    // iterative
    int returnNoOfDigit(int n){
        int c = 0;
        while(n > 0){
            c++;
            n/=10;
        }
        return c;
    }

    // recursive
    int returnNoOfDigitRec(int n){
        // Base case
        if(n >= 0 && n <= 9)return 1;

        // recursive call
        int d = returnNoOfDigitRec(n/10);
        // our part
        return d+1;
    }

}