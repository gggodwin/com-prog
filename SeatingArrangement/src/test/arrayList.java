package test;


import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {

    public static void main(String[] args) {

        ArrayList <Integer> example = new ArrayList<Integer>();
        example.add(2);
        example.add(3);
        example.add(1);
        example.add(2,4);
        example.set(2,5);
        example.remove(new Integer(1));
        System.out.println("Size " + example.size());
        System.out.println("Get" + example.get(2));
        System.out.println(example);

        Object [] convert = example.toArray();
        for (int i = 0; i < convert.length; i++) {
            System.out.print(convert[i] + " ");
        }
    }
}
