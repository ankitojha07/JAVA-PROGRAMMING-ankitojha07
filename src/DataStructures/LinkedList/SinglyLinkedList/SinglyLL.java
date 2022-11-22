package DataStructures.LinkedList.SinglyLinkedList;

import java.util.Scanner;

class Node{
    public int value;
    public Node next;
}

public class SinglyLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLL sl = new SinglyLL();
        int n = sc.nextInt();
        int val = 0;
        Node node1 = new Node();

        //node1.value = 12;
        //node1.next = null;
        node1 = node1.next;
        for (int i = 0; i < n; i++) {
            val = sc.nextInt();
            node1 = sl.insert(node1, val);
        }
        sl.printFunc(node1);
        //node1 = sl.insertArFirst(node1,123);
        sl.printFunc(node1);
    }

    public void printFunc(Node head) {
        //head=head.next;
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
            System.out.println();
        }
    }

    public Node insert(Node head, int val) {
        Node n1 = new Node();
        n1.value = val;
        n1.next = null;
        if (head == null) {
            return n1;
        }
        return head;
    }
}