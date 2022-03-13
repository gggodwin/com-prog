package QLinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.enqueue(list,23);
        list.enqueue(list,35);
        list.enqueue(list,1);
        list.enqueue(list,22);
        list.dequeue(list);
        list.dequeue(list);
        list.dequeue(list);
        list.dequeue(list);




        list.print(list);
    }
}
