package Queue;

import Stack.Stack;

public class Main {
    public static void main(String[] args) {

        Queue s = new Queue();
        s.setMax(10);

        s.enqueue(23);
        s.enqueue(21);
       s.peek();
       s.findTail();

    }
}
