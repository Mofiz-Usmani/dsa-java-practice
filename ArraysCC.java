import java.util.*;

public class ArraysCC {
    // public static void update(int marks[], int nonChangable) {
    //     nonChangable = 10;
    //     System.out.println(nonChangable);
    //     for(int i=0; i<marks.length; i++){
    //         marks[i] = marks[i] + 1;
    //     }
    // }

// -------------------------------------------------

    // public static int linearSearch(int arr[], int key) {
    //     for(int i=0; i<arr.length; i++) {
    //         if(arr[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

// -------------------------------------------------

    // public static int largestNum(int number[]){
    //    int largest = Integer.MIN_VALUE; // Start with the smallest possible integer so any number in the array will be larger
    //    int smallest = Integer.MAX_VALUE; // Start with the largest possible integer so any number in the array will be smaller


    //     for(int j=0; j<number.length; j++){
    //         if(smallest > number[j]){
    //             smallest = number[j];
    //         }
    //     }
        
    //     for(int i=0; i<number.length; i++){
    //         if(largest < number[i]) {
    //             largest = number[i];
    //         }
    //     }
    //     System.out.println("Smallest Value is : "+smallest);
    //     return largest;
    // }

// -------------------------------------------------

    // public static int binarySearch(int numbers[], int key){
    //     int start = 0, end = numbers.length-1;

    //     while(start <= end) {
    //         int mid = (start + end) / 2;

    //         //comparison 
    //         if(numbers[mid] == key){ // found
    //             return mid;
    //         }
    //         if(numbers[mid] < key){ //right
    //             start = mid+1;
    //         } else {  //left
    //             end = mid-1;
    //         }
    //     }
    //     return -1;
    // }

// -------------------------------------------------

    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last) {
            //swap 
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

        

// -------------------------------------------------

        // int numbers[] = {2,4,6,8,10,12,14};
        // int key = 10;
        // System.out.println("Index for key is : "+ binarySearch(numbers, key));

// -------------------------------------------------

        // int number[] = {3,4,6,2,5};
        // System.out.println("largest value is : "+ largestNum(number));

// -------------------------------------------------

        // int arr[] = {2,4,6,8,10,12,14,16}; 
        // int key = 10;

        // int index = linearSearch(arr, key);
        // if(index == -1) {
        //     System.out.println("Not Found");
        // }else {
        //     System.out.println("Key is at index : "+index);
        // }

// -------------------------------------------------

        // int marks[] = {97, 98, 99};
        // int nonChangable = 5;
        // update(marks, nonChangable);
        // System.out.println(nonChangable);

        // //print marks 
        // for(int i=0; i<marks.length; i++) {
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println();

// -------------------------------------------------

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
