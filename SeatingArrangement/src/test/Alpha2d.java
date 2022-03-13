package test;

import java.util.Arrays;

public class Alpha2d {

    public static void main(String[] args) {

        int [][] alpha = new int[10][20];



        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 20; c++){
                if (r == 0 && c ==0){
                    alpha[r][c]= 1;
                }
                if (r == 1 && c ==0||r == 2&& c ==0||r == 3&& c ==0||r == 4&& c ==0||
                        r == 5&& c ==0||r == 6&& c ==0||r == 7&& c ==0||r == 8&& c ==0||r ==9 && c ==0){
                    alpha[r][c] = 2;
                }


             if (c == 1 ||c == 2 ||c == 3 ||c == 4 ||c == 5 ||c == 6 ||c == 7 ||c == 8 ||c == 9 ||c == 10 ||c == 11 ||c == 12 ||c == 13 ||c == 14 ||c == 15 ||c == 16 ||c == 17 ||c == 18 ||c == 19 ){
                 if (c == 1 && r == 0)
                 alpha[r][c] = 10;
                 else
                     alpha[r][c] = 5;
             }
                System.out.print(alpha[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
