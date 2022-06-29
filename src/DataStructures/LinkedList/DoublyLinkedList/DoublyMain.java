package DataStructures.LinkedList.DoublyLinkedList;

public class DoublyMain {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(2);
        list.insertFirst(25);
        list.insertFirst(12);
        list.insertFirst(232);
        list.insertFirst(123);

        list.display();
    }
}
