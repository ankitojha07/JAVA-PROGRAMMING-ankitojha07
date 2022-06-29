package DataStructures.LinkedList.CircularLinkedList;

public class CircularLL {

    private Node head;
    private Node tail;
    private int size;
    public CircularLL(){
        this.size = 0;
    }

    public class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
       if (head ==null){
           head = node;
           tail = node;
           return;
       }
       tail.next=node;
       node.next=head;
       tail=node;
    }

    public void display(){
        Node node = head;
        if (head==null) System.out.println("Empty List!");
        else {
            System.out.println("Nodes of Circular LL are : ");
            do {
                System.out.print(node.data+" ");
                node=node.next;
            } while (node!=head);
            System.out.println();
        }
    }
}
