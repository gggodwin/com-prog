package Stack;

public class Main {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.setMax(10);


        s.push(23);
        s.push(2);
        s.push(10);
        s.push(3);
        s.push(34);
        s.push(6);
        s.pop();



        System.out.println("_____________");

        s.peek();

        System.out.println("_____________");
        System.out.println("After pop: ");
        s.print();




    }
}
