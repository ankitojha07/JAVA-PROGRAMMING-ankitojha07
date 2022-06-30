package DataStructures.QueueDS;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
class QueueImplement{
    Node front, rear;
    public void enqueue(int data){
        Node newNode = new Node(data);
        if (front==null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() throws Exception {
        if (front==null){
            throw new Exception();
        }
        int result = front.data;
        front = front.next;
        return result;
    }
    public void traverseQueue()  {
        if (front==null) {
            System.out.println("Empty Queue!");
        }
        while (front.next!=null){
            System.out.print(front.data + " ");
            front=front.next;
        }
    }
}
public class QueueBasics {
    public static void main(String[] args) throws Exception {
        QueueImplement qi = new QueueImplement();
        qi.enqueue(5);
        qi.enqueue(9);
        qi.enqueue(12);
        qi.enqueue(66);
        qi.traverseQueue();
        System.out.println(qi.dequeue());
    }
}
