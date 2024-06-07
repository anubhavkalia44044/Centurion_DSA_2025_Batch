package Trees;

import java.util.Scanner;

public class Implementation {
    public static void main(String rags[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Tree tr=new Tree(a);
        tr.InOrder(tr.root);
        System.out.println();
    }
}
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
class Tree{
    Node root;
    public Tree(int a[]){
        root=BuildTree(0,a);
    }
    public Node BuildTree(int ind,int a[]){
        if(ind>=a.length)
            return null;
        Node n=new Node(a[ind]);
        //left 2*ind+1
        n.left=BuildTree(2*ind+1,a);
        //right 2*ind+2
        n.right=BuildTree(2*ind+2,a);
        return n;

    }
    public void InOrder(Node root){
        if(root==null)
            return;
        InOrder(root.left);
        System.out.print(root.val+" ");
        InOrder(root.right);
    }
}
