package Day21;
import Day20.LLnode;
import Day20.LL;

public class LLconti {
    public static void main(String[] args) {
        LL obj = new LL();
        LLnode h = obj.make();
        System.out.println(obj.len(h));
    }
}
