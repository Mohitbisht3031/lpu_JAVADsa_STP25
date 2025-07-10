package Day26;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BT {
    public BTnode makeBT(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if(val == -1){
            sc.close();
            return null;}

        BTnode root = new BTnode(val);
        System.out.println("Give the vlaue of left child of "+root.val);
        root.left = makeBT();
        System.out.println("Give the val of the right child fo "+root.val);
        root.right = makeBT();

        sc.close();
        return root;
    }

    public BTnode makeBTLevelWise(){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if(val == -1){
            sc.close();
            return null;
        }
        BTnode root = new BTnode(val);
        Queue<BTnode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            BTnode f = q.poll();
            System.out.println("Give the left and right child of "+f.val);
            int l = sc.nextInt();
            int r = sc.nextInt();

            if( l != -1){
                f.left = new BTnode(l);
                q.add(f.left);
            }
            if(r != -1){
                f.right = new BTnode(r);
                q.add(f.right);
            }
        }

        sc.close();
        return root;
    }

    void printBT(BTnode root){
        if(root == null)return;
        System.out.println(root.val);
        printBT(root.left);
        printBT(root.right);
        return;
    }

}
