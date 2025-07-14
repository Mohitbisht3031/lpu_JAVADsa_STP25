package Day28;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import Day26.BTnode;

public class BTconti2 {
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

    ArrayList<Integer> helper(BTnode root){
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null){
            arr.add(0);
            arr.add(0);
            return arr;
        }

        ArrayList<Integer>lst = helper(root.left);
        ArrayList<Integer>rst = helper(root.right);

        int sMaxi = 0;
        int maxi = Math.max(lst.get(0),lst.get(1));
        if(maxi == lst.get(0)){
            sMaxi = Math.max(lst.get(1),rst.get(0));
        }else{
            sMaxi = Math.max(rst.get(1), lst.get(0));
        }

        if(maxi < root.val){
            sMaxi = maxi;
            maxi = root.val;
        }else if(sMaxi < root.val){
            sMaxi = root.val;
        }

        arr.add(maxi);
        arr.add(sMaxi);
        return arr;
    }

    public Integer secondLargest(BTnode root){
        if(root == null)return -1;
        ArrayList<Integer>arr = helper(root);
        return arr.get(1);
    }

    BTnode LCA(BTnode root,BTnode p,BTnode q){
        if(root == null || root == p || root == q)return root;

        BTnode lans = LCA(root.left,p,q);
        BTnode rans = LCA(root.right,p,q);

        if(lans != null && rans != null){
            return root;
        }else if(lans == null && rans != null)return rans;
        else if(rans == null && lans != null)return lans;

        return null;
    }

    BTnode LCABST(BTnode root,BTnode p,BTnode q){
        if(root == null || root == p || root == q)return root;
        if(root.val > p.val && root.val > q.val)return LCABST(root.left, p, q);
        else if(root.val < p.val && root.val < q.val)return LCABST(root.right, p, q);

        return root;
    }

    BTnode insertBST(BTnode root,int val){
        if(root == null)return new BTnode(val);
        if(root.val < val){
            root.right = insertBST(root.right, val);
        }else{
            root.left = insertBST(root.left, val);
        }

        return root;
    }

}
