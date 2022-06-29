package DataStructures.LinkedList.CircularLinkedList;

public class CircularMain {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(12);
        list.insert(45);
        list.insert(65);
        list.insert(89);
        list.insert(5);

        list.display();
    }
}
