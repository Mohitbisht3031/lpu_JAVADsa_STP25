package Day3;

public class firstOccurance {
    private static int firstOccuranceRec(String str,char ch,int i){
        if(i >= str.length())return -1;
        if(str.charAt(i) == ch)return i;
        return firstOccuranceRec(str, ch, i+1);
    }

    public static void main(String[] args) {
        String str = "abcabcaaacc";
        System.out.println(firstOccuranceRec(str,'c',0));
    }
}
