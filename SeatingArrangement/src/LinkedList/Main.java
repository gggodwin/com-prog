package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();


            LinkedList.insert(list, 23);
        LinkedList.insert(list, 2);
        LinkedList.insert(list, 3);
        LinkedList.insert(list, 34);
        LinkedList.insert(list, 6);



        System.out.println("Before:");
        list.print(list);
        System.out.println();



        System.out.println("Deletion");
        list = LinkedList.deletebyPos(list,4);
        System.out.println();

        System.out.println("Deletion");
        list = LinkedList.deletebyKey(list,33);
        System.out.println();


        System.out.println("After deletion");
        list.print(list);

        /*System.out.println("Deletion");
        LinkedList.deletebyKey(list,3);
        System.out.println();

        System.out.println("Deletion");
        LinkedList.deletebyKey(list,23);
        System.out.println();


        System.out.println("After deletion");
        list.print(list);*/
    }
}
