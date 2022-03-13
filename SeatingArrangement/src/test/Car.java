package test;

import java.util.Scanner;

public class Car {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] cars = new int[10];
        int [] employer = new int [10];


        System.out.println("Is there a car sold: ");

        for (int i = 0; i < cars.length; i++) {
            cars[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < cars.length; i++) {
            sum = sum + cars[i];
        }
        System.out.println(sum);

        int max = cars[0];

        for (int i = 0; i < cars.length; i++) {
            if (max < cars[i]){
                max = cars[i];
            }
        }

        System.out.println("enter whose employee");
        for (int i = 0; i < cars.length; i++) {
            if (max== cars[i]){
                System.out.println(i + " ");
            }
        }

    }
}
