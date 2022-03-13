package test;

import java.util.Arrays;

public class Alpha2 {

    public static void main(String[] args) {

        int [][] alpha = new int[3][4];

        alpha[0][0] = 6;
        alpha[0][1] = 8;
        alpha[0][2] = 12;
        alpha[0][3] = 9;

        alpha[1][0] = 17;
        alpha[1][1] = 5;
        alpha[1][2] = 10;
        alpha[1][3] = 6;

        alpha[2][0] = 14;
        alpha[2][1] = 13;
        alpha[2][2] = 16;
        alpha[2][3] = 20;

        for (int r = 0; r < 3; r++){
            for (int c =0; c <4; c++){
                if(r==0 && c==0 ||r==0 && c==1 ||r==0 && c==2 || r==0 && c==3)
                System.out.print(alpha[r][c] + "\t");
                else if (r==0 && c==0 || r==1 && c==0 || r==2 && c==0)
                    System.out.print(alpha[r][c] + "\t");
                else if (r == 2 && c==0||r == 2 && c==1||r == 2 && c==2){
                    System.out.print(alpha[r][c] + "\t");
                }
                else if (r == 0 && c==3||r == 1 && c==3||r == 2 && c==3){
                    System.out.print(alpha[r][c] + "\t");
                }
                else if (r == 1 && c==1||r == 1 && c==2){
                    alpha[r][c] = 0;
                    System.out.print(alpha[r][c] + "\t");
                }
            }
            System.out.println();
        }
    }
}
