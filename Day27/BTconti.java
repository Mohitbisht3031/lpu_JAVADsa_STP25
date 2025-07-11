package Day27;
import Day26.BTnode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Day25.queue;

public class BTconti {
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

    void printBTLevelWise(BTnode root){
        if(root == null)return;
        Queue<BTnode>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            for(int i = 0;i<s;i++){
                BTnode f = q.poll();
                System.out.print(f.val+"-");
                if(f.left != null){
                    System.out.print(f.left.val+",");
                    q.add(f.left);
                }
                if(f.right != null){
                    System.out.print(f.right.val);
                    q.add(f.right);
                }
                System.out.println();
            }   
        }
        return;
    }

    public int height(BTnode root){
        if(root == null)return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }

    public int heightIterative(BTnode root){
        if(root == null)return 0;
        Queue<BTnode>q = new LinkedList<>();
        q.add(root);
        int c = 0;
        while(!q.isEmpty()){
            int s = q.size();
            for(int i = 0;i<s;i++){
                BTnode f = q.poll();
                if(f.left != null)q.add(f.left);
                if(f.right != null)q.add(f.right);
            }
            c++;
        }
        return c;
    }

    void pre(BTnode root){
        if(root == null)return;
        System.out.println(root.val);
        pre(root.left);
        pre(root.right);
    }

    int maxPathSum(BTnode root){
        if(root == null)return 0;
        int ls = maxPathSum(root.left);
        int rs = maxPathSum(root.right);
        
        return Math.max(ls, rs)+root.val;
    }

    boolean same(BTnode r1, BTnode r2){
        if(r1 == null && r2 == null)return true;
        if(r1 == null || r2 == null)return false;
        if(r1.val != r2.val)return false;

        return same(r1.left, r2.left) && same(r1.right, r2.right);
    }

}
