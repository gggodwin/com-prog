package test;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList <Integer> num = new LinkedList<Integer>();

        num.add(0,1);
        num.add(2);
        num.add(3);
        num.add(4);

        num.removeLast();
        num.removeFirst();

        System.out.println(num);
    }
}
