package QLinkedList;

public class LinkedList {
    Qnode tail,head;


   public LinkedList (){
       this.head = this.tail = null;

    }


     public void enqueue (LinkedList list, int data){

        Qnode newNode = new Qnode(data);
        if (this.tail == null){
            this.head = this.tail = newNode;
            return;
        }
        this.tail.next = newNode;
        this.tail = newNode;

     }

     public void dequeue(LinkedList list){

       if (this.head == null){
           return;
       }
       Qnode currNode = this.head;
       this.head = this.head.next;

       if (this.head == null){
           this.tail = null;
       }

     }

     public void print (LinkedList list){
         Qnode currNode = list.head;

         while (currNode != null){
             System.out.print(currNode.data + " ");
             currNode = currNode.next;
             System.out.println(currNode);
         }
     }
}

/*
    LinkedList (){
        head = null;
        tail = null;
    }


     public void enqueue (LinkedList list, int data){

        Qnode newNode = new Qnode(data);
        if (list.tail == null)
        {
            list.tail = newNode;
        }
        else
        {
           Qnode temp = list.tail;
           while (temp.next != null){
               temp = temp.next;
           }
           temp.next = newNode;
        }
     }

     public void dequeue(LinkedList list){

         Qnode curNode = list.head , temp = null;
         temp = list.tail;

         if (temp != null){
              list.tail = temp.next;
         }
     }

     public void print (LinkedList list){
         Qnode currNode = list.tail;

         while (currNode != null){
             System.out.print(currNode.data + " ");
             currNode = currNode.next;
             System.out.println(currNode);
         }
     }
     */