import java.io.*;
import java.util.*;

class Node {
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class day_23_bst_level_order_traversal {
    static void levelOrder(Node root){
        //Write your code here
        Queue<Node> queue = new LinkedList<Node>();
        if (root != null) {
            queue.add(root);
            while (!queue.isEmpty()) {
                Node currentNode = queue.remove();
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null)
                    queue.add(currentNode.left);
                if (currentNode.right != null)
                    queue.add(currentNode.right);
            }
        }    
    } 

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}