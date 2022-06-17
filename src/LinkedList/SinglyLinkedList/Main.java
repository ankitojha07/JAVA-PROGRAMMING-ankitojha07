package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(6);
        list.insertFirst(46);
        list.insertFirst(43);
        list.insertFirst(24);
        list.insertFirst(14);
        list.insertLast(98);

        list.display();

        System.out.println("Deletion start here!");
        System.out.println(list.deleteFirst());
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAtIndex(3);
        list.display();
    }
}
