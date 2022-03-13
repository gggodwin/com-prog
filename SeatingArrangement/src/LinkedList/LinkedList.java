package LinkedList;

public class LinkedList<currNode> {

    Node head;

    public static LinkedList insert (LinkedList list,int data){

        Node newNode = new Node(data);
        newNode.next = null;
        if (list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }


    public void print (LinkedList list){

        Node currNode = list.head;


        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
            System.out.println(currNode);
        }

    }

    public static LinkedList deletebyKey (LinkedList list, int key) {
        // lets first declare the current node

        Node currNode = list.head, prev = null;
        // lets keep track of the prev node


        // Case 1
        // this means if the current node is equal to the head of the linked list
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println(key + " is found and deleted");
            return list;        }
        // Case 2 will keep tract the prev
        while (currNode != null && currNode.data != key) {
            // keep track of the prev
            prev = currNode;
            currNode = currNode.next;
        }

            if (currNode != null){
                prev.next = currNode.next;
                System.out.println(key + " is found and deleted");
            }


        //case 3
        if (currNode == null){

            System.out.println("Error! Can`t be found");
        }
        return list;

    }

    public static LinkedList deletebyPos (LinkedList list, int index){

        Node currNode = list.head,prev  = null;

        // Case 1 if the position you want to delete is at the index 0

        if (index == 0 && currNode != null){
            list.head = currNode.next;
            System.out.println("index " + index + "will be deleted");
            return list;
        }

        int counter = 0;

        while (currNode != null){

            if (counter == index){
                prev.next = currNode.next;
                System.out.println("index " + index + " position is deleted " + currNode.data + " counter: " + counter);
                break;
            }
            else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        if (currNode == null){
            System.out.println("The postion can`t be found");
        }
        return list;
    }




}
