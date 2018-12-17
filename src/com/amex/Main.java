package com.amex;

public class Main {

    static char matrix[][] = {{'A', 'B', 'C', 'D', 'E'},
                              {'F', 'G', 'H', 'I', 'J'},
                              {'K', 'L', 'M', 'N', 'O'},
                              {'P', 'Q', 'R', 'S', 'T'},
                              {'U', 'V', 'W', 'X', 'Y'},};

    static int N = matrix.length;

    public static void main(String[] args) {
        // write your code here
         swapDiagonal(matrix);

        // Displaying modified matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();

        }

    }

    static void swapDiagonal(char matrix[][]) {
        for (int i = 0; i < N; ++i) {
            char temp = matrix[i][i]; // create temp array
            //System.out.println("temp : " + temp);
            /**    swap [0][0] - [0][4]
             *          [1][1] - [1][3]
             *          [3][1] - [3][3]
             *          [4][0] - [4][4]
             *          row stay same only column reduced by (row number - 1)
            ***/
            matrix[i][i] = matrix[i][N - i - 1]; // switch columns for
            matrix[i][N - i - 1] = temp;
            //System.out.println("now temp : " + temp);
        }
    }
}
