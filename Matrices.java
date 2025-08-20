import java.util.*;

public class Matrices {
    public static void search(int matrix[][]){
        int max = matrix[0][0];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                    // System.out.println("Found at cell (" + i + "," + j + ")");
                    // return true;
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("largest element in array is : " + max);
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        //Output : 
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println();
        search(matrix);
    }
}
