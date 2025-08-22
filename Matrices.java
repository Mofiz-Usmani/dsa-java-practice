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

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

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
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        
        return sum;
    }


    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){ 
                System.out.println("Found key at ("+ row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void noofvalue(int matrix[][], int target) {
        int count = 0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == target) {
                    count++;
                }
            }
        }
        System.out.println("Number of occurrences of " + target + " : " + count);
    }


    public static void sumofnumbers(int matrix[][]) {
        int sum = 0;
            for(int j=0; j<matrix[0].length; j++) {
                sum += matrix[1][j];
            }
        System.out.println(sum);
    }

    public static void trasnsposematrix(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int transposed[][] = new int[cols][rows];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for(int i=0; i<cols; i++) {
            for(int j=0; j<rows; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {11, 12, 13},
            {21, 22, 23}
        };
        int target = 8;
        int key = 33;

        // Spiral print
        // printSpiral(matrix);

        // Search example
        // search(matrix, 10);

        // Diagonal sum
        // int sum = diagonalSum(matrix);
        // System.out.println("Diagonal sum : " + sum);


        // Staircase search
        // staircaseSearch(matrix, key);

        // Count occurrences of a value
        // noofvalue(matrix, target);

        // Sum of numbers in the matrix excluding the first row
        // sumofnumbers(matrix);

        // Transpose the matrix
        trasnsposematrix(matrix);
    }
}
