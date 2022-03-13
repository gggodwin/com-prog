package DoublyLinkedL;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.InsertAtHead(5);
        list.InsertAtHead(4);
        list.InsertAtHead(3);
        list.InsertAtHead(2);
        list.InsertAtHead(1);
        list.insertAfter(list.head,6);
        list.append(34);


        list.display();

        System.out.println();
        System.out.println("Current: ");
        list.delete(5);
        list.display();
    }
}
