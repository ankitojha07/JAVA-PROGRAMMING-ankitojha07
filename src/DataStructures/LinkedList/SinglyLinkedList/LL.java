package DataStructures.LinkedList.SinglyLinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail==null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size --;
        return val;
    }

    public void deleteLast(){
        if (size==0){
            System.out.println("List is empty!");
        } else if (size ==0){
            head = tail = null;
            size =0;
        } else {
            Node temp = head;
            for (int i =0; i<size-2; i++){
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }
    }

    public void deleteAtIndex(int idx){
        if (idx<0 || idx>size) System.out.println("invalid index");
        else if (idx==0) deleteFirst();
        else if (idx==size) deleteLast();

        else {
            Node temp = head;
            for (int i=0; i<idx-1;i++){
                temp=temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public LL(){
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int value){
            this.val = value;
        }

        public Node(int value, Node next){
            this.val = value;
            this.next = next;
        }
    }
}
