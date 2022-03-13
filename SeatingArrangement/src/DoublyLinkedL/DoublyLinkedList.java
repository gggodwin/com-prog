package DoublyLinkedL;

public class DoublyLinkedList {

    Node head;

    public static Node getNewNode (int data){

        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = null;
        newNode.prev = null;
        return newNode;
    }


    public void InsertAtHead (int data){

        Node currNode = getNewNode(data);
         if (head == null){
             head = currNode;
             return;
         }
         currNode.next = head;
         head.prev = currNode;
         head = currNode;
    }

/*
    public void push (int data){

        Node newNode = new Node(data);

        newNode.data = data;
        newNode.prev = null;
        newNode.next = head;

        if (head != null)
            newNode.prev = newNode;
            head = newNode;
    }*/

    public void insertAfter (Node prev, int data){

        if (prev == null){
            System.out.println("Error");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = prev.next;
        newNode.prev = prev;
        prev.next = newNode;

        if (newNode.next != null){
            newNode.next.prev = newNode;
        }
    }

    public void append (int data){ //insert at end of the DDL

        Node newNode = new Node(data);


        Node last = head;

        newNode.next = null;

        if (head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        while (last.next != null)

            last = last.next;
            last.next = newNode;
            newNode.prev = last;
    }

    public void deleteNode (Node del){

        if (head == null || del == null){
            return;
        }

        if (head == del){
            head = del.next;
        }

        if (del.next != null){
            del.next.prev =del.prev;
        }

        if (del.prev != null)
            del.prev.next = del.next;

    }

    public void delete (int n){


        // this means if the DDl is empty
        if (head == null && n <= 0){
            return;
        }

        //declare the current node as the head
        Node currNode = head;

        // this is also used to transverse through the DDL
        // this loop is use to return the value of the node that will be deleted
        for (int i = 1; currNode != null && i < n; i++){
            currNode = currNode.next;
        }

        // if the current node is equal to null or it is greater than n
        if(currNode == null)
            return;


        // calls the method to continue the delete of node inside the DDL
        deleteNode(currNode);

    }

    public void display (){

        Node currNode = head;

        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
            System.out.println(currNode);
        }

    }
}
