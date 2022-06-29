package DataStructures.TreedataStr.BinaryTree;
import java.util.Scanner;
class Node{
    Node left;
    Node right;
    int val;

    Node(int val){
        this.val = val;
        right = null;
        left = null;
    }
}

public class BTTraversal {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        createTree();
    }
    static Node createTree(){
        Node root = null;
        System.out.print("Enter data : ");
        int data = sc.nextInt();

        if(data == -1) return null;

        root = new Node(data);

        System.out.println("Enter data for the left of "+data);
        root.left = createTree();

        System.out.println("Enter the data for the right of the "+data);
        root.right = createTree();

        return root;
    }
}