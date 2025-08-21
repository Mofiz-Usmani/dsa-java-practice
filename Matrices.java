import java.util.*;

public class Matrices {

    // Search key in matrix
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    // Spiral print method
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // left
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void diagonalSum(int matrix[][], int key) {

        // O(n^2) Approach
        // for (int i = 0; i < matrix.length; i++) {   
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        // O(n) Approach
        for(int i=0; i<matrix.length; i++) {
            if(key == matrix[i][i]) {
                System.out.println("Key found at diagonal: (" + i + "," + i + ")");
            }
            if (i != matrix.length - 1 - i) { // Avoid double counting the middle element in odd-sized matrices
                if(key == matrix[i][matrix.length - 1 - i]) {
                    System.out.println("Key found at anti-diagonal: (" + i + "," + (matrix.length - 1 - i) + ")");
                }
            }
        }
    }
    public static void main(String args[]) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 39;

        // Spiral print
        // printSpiral(matrix);

        // Search example
        // search(matrix, 10);

        // Diagonal sum
        diagonalSum(matrix, key);
    }
}
