package Queue;

public class Queue {

    private int head; // this declares the head of the queue or the first element
    private int tail; // this declares the tail or the element of the queue
    private int max; // this means the maximum number of the queue or capacity
    private int count; // the current number of the array
    private int [] arr; // declares the array the were going to use

    // create a constructor for our queue
    Queue() {
        head = 0;   // this means that our head will start at index 0
        tail = -1;  // this mean our tail is still on t
        count = 0;
    }

    public void setMax(int size) {
        arr = new int[size];
        max = size;
    }

    public boolean isFull (){
        return (count == max) ;

    }

    public boolean isEmpty (){
        return (count == 0);
    }

    public void enqueue (int x){
        if (isFull()){
            System.out.println("Overflow!!!");
            System.exit(1);
        }
        else{
            System.out.println(x + " is inserted");
            //tail++;
            tail = (tail + 1 )% max; // circular array
            arr[tail] = x;
            count++;
        }
    }

    public void dequeue (){
        if (isEmpty()){
            System.out.println("Underflow!!!");
            System.exit(1);
        }
        else{
            //head ++;
            head = (head + 1)%max; //circular array ex 2 + 1 = 3/10 = .3
            count--;
        }
    }

    public void peek (){
        if (isEmpty()){
            System.out.println("Empty");
            System.exit(1);
        }
        else {
            System.out.println("The head is " + arr[head]);
        }
    }

    public void findTail (){
        if (isEmpty()){
            System.out.println("Empty");
            System.exit(1);
        }
        else {
            System.out.println("The tail is " + arr[tail]);
        }
    }




}
