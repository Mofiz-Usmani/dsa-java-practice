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


    // Clear Ith Bit
    public static int ClearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    // Update Ith Bit
    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return ClearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }

        // Clear Ith Bit
        // n = ClearIthBit(n, i);
        // int bitMask = newBit<<i;
        // return n | bitMask;
    }


    public static void main(String[] args) {
        // Update Ith Bit
        System.out.println(updateIthBit(10, 2, 1));

        // Clear Ith Bit
        // System.out.println(ClearIthBit(10, 1));

        // Set Ith Bit
        // System.out.println(setIthBit(10, 2));

        // Get Ith Bit
        // System.out.println(getIthBit(10, 2));

        // Odd or Even
        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(16);
    }
}
