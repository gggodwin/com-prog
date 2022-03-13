package Sample;


import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        char [][] dot = {{' ',' ',' ',' ',' ',' '},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'},
                {' ','*','*','*','*','*','*'}};

    String cho;
    int row;
    int column;
    String ticket;

    do {

        System.out.println("Enter what ticket: ");
        ticket = input.next();


        if (ticket.equalsIgnoreCase("a")) {
            System.out.println("Enter what seat: ");
            row = input.nextInt();
            if (row > 2) {
                System.out.println("out of bounds");
                return;
            } else
                column = input.nextInt();
            for (int r = 1; r < dot.length; r++) {
                for (int c = 1; c < dot[c].length; c++) {
                    if (r == row & c == column)
                        dot[r][c] = 'X';
                    System.out.print(dot[r][c] + "\t");
                }
                System.out.println();
            }
        }

        if (ticket.equalsIgnoreCase("b")) {
            System.out.println("Enter what seat: ");
            row = input.nextInt();
            if (row < 2 || row > 7) {
                System.out.println("out of bounds");
                return;
            } else
                column = input.nextInt();
            for (int r = 1; r < dot.length; r++) {
                for (int c = 1; c < dot[c].length; c++) {
                    if (r == row & c == column)
                        dot[r][c] = 'X';
                    System.out.print(dot[r][c] + "\t");
                }
                System.out.println();
            }
        }

        if (ticket.equalsIgnoreCase("c")) {
            System.out.println("Enter what seat: ");
            row = input.nextInt();
            if (row < 7 || row > 13) {
                System.out.println("out of bounds");
                return;
            } else
                column = input.nextInt();
            for (int r = 1; r < dot.length; r++) {
                for (int c = 1; c < dot[c].length; c++) {
                    if (r == row & c == column)
                        dot[r][c] = 'X';
                    System.out.print(dot[r][c] + "\t");
                }
                System.out.println();
            }
        }



        System.out.println("Do you want to continue: ");
        cho = input.next();
    } while (cho.equalsIgnoreCase("y"));




    }
}
