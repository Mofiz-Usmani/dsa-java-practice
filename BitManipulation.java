import java.util.*;

public class BitManipulation {

    // Odd or Even
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // Get Int Bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;

        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }


    // Set Ith Bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }


    public static void main(String[] args) {


        // Set Ith Bit
        System.out.println(setIthBit(10, 2));

        // Get Ith Bit
        // System.out.println(getIthBit(10, 2));

        // Odd or Even
        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(16);
    }
}
