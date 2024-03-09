package Tree;

import java.util.LinkedList;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data= data;
    }
}



public class InorderTraversal {
    public static void Inorder(Node node) {
        if(node==null) {
            return ;

        }
        else {
            Inorder(node.left);
            System.out.print(node.data+ " ");
            Inorder(node.right);
        }

    }
    public static void Preorder(Node node) {

        if(node!=null) {
            System.out.print(node.data + " ");
            Preorder(node.left);
            Preorder(node.right);
        }
    }
    public static void Postorder(Node node) {
        if(node!=null) {
            Postorder(node.left);
            Postorder(node.right) ;
            System.out.print(node.data + " ");



        }
    }
    public static int height(Node node) {
        if(node==null) {
            return 0;
        }
        int lh= height(node.left);
        int rh = height(node.right);
        return Math.max(lh,rh)+1;
    }

    public static void LevelOrder(Node node) {
        Queue<Node> q= new LinkedList<>();
        if(node==null) {
            return;
        }
        q.add(node);
        q.add(null);

        while(!q.isEmpty()) {

       Node curr= q.remove();
       if(curr==null) {
           System.out.println();
           if(q.isEmpty()){
               break ;
           }
             else {
               q.add(null);
           }

       }
       else {
           System.out.print(curr.data+" ");
           if(curr.left!=null) {
               q.add(curr.left);
           }
           if(curr.right!=null) {q.add(curr.right);}

       }
        }
    }
    public static void main(String[] args) {
        Node n1= new Node(10);
        Node n2= new Node(13);
        Node n3= new Node(14);
        Node n4= new Node(16);
        Node n5= new Node(18);
        Node n6= new Node(20);
        Node n7= new Node(23);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n3.left=n5;
        n3.right=n6;
        n4.left=n7;
        Inorder(n1);
        System.out.println();
        Preorder(n1);
        System.out.println();
        Postorder(n1);
        System.out.println();

        System.out.println("Height of tree is  " + height(n1));
        System.out.println();
        LevelOrder(n1);

    }
}
