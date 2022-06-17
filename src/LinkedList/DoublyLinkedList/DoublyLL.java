package LinkedList.DoublyLinkedList;

public class DoublyLL {
    private Node head;
    private Node tail;
    public int size;

    public DoublyLL(){
        this.size = 0;
    }
    class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val=val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!=null){
            head.prev=node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.print("END");
    }
}
