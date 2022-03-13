package test;


import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {
        Stack<Integer> num = new Stack<Integer>();

        num.push(2);
        num.push(4);
        num.push(6);
        num.push(8);

        System.out.println(num);

        num.pop();

        System.out.println(num.isEmpty());
        System.out.println(num.get(0));
        System.out.println(num.remove(2));
        System.out.println(num.set(0,23));

        System.out.println("After pop: ");
        System.out.println(num);
    }


}
