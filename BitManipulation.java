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

    // Clear I Bits
    public static int clearIBits(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }


    // Clear Bits In Range
    public static int clearBitsInRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    // Check if Power of Two
    public static boolean isPowerOfTwo(int n) {
        if((n&(n-1)) == 0 && n != 0 && n > 0) {
            return true;
        }else {
            return false;
        }
    }

    // Count Set Bits
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {

        // Count Set Bits
        // System.out.println(countSetBits(10));

        // Check if Power of Two
        // System.out.println(isPowerOfTwo(2));

        // Clear Bits In Range
        // System.out.println(clearBitsInRange(10, 2, 4));

        // Clear I Bits
        // System.out.println(clearIBits(15, 2));

        // Update Ith Bit
        // System.out.println(updateIthBit(10, 2, 0));

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
