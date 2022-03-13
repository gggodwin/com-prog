package test;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Month & Day: ");
        String n;
        n = input.next();
        int cho = input.nextInt();

        if (n.equalsIgnoreCase("jan")){
            System.out.print("God watches over me");
        }
        if (n.equalsIgnoreCase("feb")){
            System.out.print("God is always with me");
        }
        if (n.equalsIgnoreCase("mar")){
            System.out.print("God is my provider");
        }
        if (cho == 1){
            System.out.print("I will be Successful");
        }
        if (cho == 2){
            System.out.print(" I will be Provider");
        }
    }

}
