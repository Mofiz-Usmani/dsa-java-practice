import java.util.*;

public class ArraysCC {
    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        System.out.println(nonChangable);
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);

        //print marks 
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        // int marks[] = new int[100]; 

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Length of Array = "+ marks.length);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Phy : "+ marks[0]);
        // System.out.println("Chem : "+ marks[1]);
        // System.out.println("Math : "+ marks[2]);
        // System.out.println("Math : "+ marks[3]); // pritns zero as empty array

        // int percentage = (marks[0] + marks[1] + marks[2])/3;
        // System.out.println("Percentage = "+percentage + "%");

        // marks[2] = 100;
        // marks[2] = marks[2] + 1;
        // System.out.println("Math : "+marks[2]);
    }
}
