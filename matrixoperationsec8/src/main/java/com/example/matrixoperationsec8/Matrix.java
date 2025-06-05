package com.example.matrixoperationsec8;

import java.util.Random;

public class Matrix {

    int[][] vals;

    public void setmatrixWithrandomValues(int row, int col){
        Random r = new Random();
        vals = new int[row][col];
        int i,j;
        for (i = 0; i<vals.length ; i++){
            for (j = 0;j<vals[i].length;j++){
                vals[i][j] = r.nextInt(100);
            }
        }
    }

    public void showmatrixToConsole(){
        int i,j;
        for (i = 0; i<vals.length ; i++){
            for (j = 0;j<vals[i].length;j++){
                System.out.print(vals[i][j] + " ");
            }
            System.out.println();
        }
    }

}
