package SLinkedList;

import QLinkedList.Qnode;

public class StackLinkedList {
    SNode top;

    public StackLinkedList (){
        this.top = null;
    }

    public boolean IsEmpty (){
        return top == null;
    }

    public void push (int x){

        SNode newNode = new SNode(x);

        if (newNode == null){
            System.out.println("null");
            return;
        }

        newNode.next = top;
        top = newNode;
    }

    public void pop (){

        if (IsEmpty()){
            System.out.println("Underflow");
            return;
        }
        else{
            //update the next pointer to the next
            top = top.next;
        }
    }

    public void display (){

        SNode currNode = top;

        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
            System.out.println(currNode);
        }
    }

}
