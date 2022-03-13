package test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

    public static void main(String[] args) {

        Queue <Integer> lane = new LinkedList<>();

        lane.add(1);
        lane.add(2);
        lane.add(3);
        lane.add(4);


        System.out.println(lane);


        lane.remove();
        System.out.println(lane);
    }
}
