package org.johnwick182.graphs;

public class MatrixReview {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {3, 2, 1},
                {90, 90, 40}
        };

        review(matrix);
    }

    public static void review(int[][] matrix) {
        System.out.println("O tamanho da matriz eh: "+ matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("print element: " + i + " " + j);
                System.out.println(matrix[i][j]);
            }
        }
    }

}
