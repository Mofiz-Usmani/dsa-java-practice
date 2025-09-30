import java.util.concurrent.SynchronousQueue;

public class TimeComplexity {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){  
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Optimised Bubble Sort
    public static void modifiedBubbleSort(int arr[]) {
        for(int turn=0; turn<arr.length; turn++){
            boolean swapped = false;
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }


    // Binary Search (requires sorted array)
    public static int binSearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (end + start)/2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }


    // Factorial 
    public static int fact(int n){
        if(n == 0){
            return 1;
        }

        return n * fact(n-1);
    }



    // Sum of n 
    public static int sumOfn(int n){
        if(n == 0){
            return 0;
        }

        return n + sumOfn(n-1);
    }



    // Fibonacci 
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    } 



    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei) {
            return;
        }

        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }


     public static void merge(int arr[], int si, int mid, int ei) {
    // Temporary array to store merged result
    int temp[] = new int[ei - si + 1];

    int i = si;      // iterator for left part
    int j = mid + 1; // iterator for right part
    int k = 0;       // iterator for temp part

    // Compare and copy smaller element from both parts to temp
    while (i <= mid && j <= ei) {
        if (arr[i] < arr[j]) {
            temp[k] = arr[i];
            i++;
        } else {
            temp[k] = arr[j];
            j++;
        }
        k++;
    }

    // Copy remaining elements from left half (if any)
    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    // Copy remaining elements from right half (if any)
    while (j <= ei) {
        temp[k++] = arr[j++];
    }

    // Copy sorted elements back into original array
    for (k = 0, i = si; k < temp.length; k++, i++) {
        arr[i] = temp[k];
    }
    }



    // Power Function 1 : 
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        return a * power(a, n-1);
    }



    // Power Function 2: 
    public static int power2(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPowerSq = power2(a, n/2) * power2(a, n/2);

        if(n%2 != 0){
            return a * halfPowerSq;
        }

        return halfPowerSq;
    }
    // https://chatgpt.com/s/t_68da8ee5382081919c837b619b226a64



    public static int power3(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = power3(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2 != 0){
            return a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args){
        // int arr[] = {5, 4, 3, 2, 1};
        // bubbleSort(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // int key = 8;
        //  int result = binSearch(arr, key);

        // if (result == -1) {
        //     System.out.println("Element not found.");
        // } else {
        //     System.out.println("Element " + key + " found at index: " + result);
        // }


        // System.out.println(fact(4));



        // System.out.println(sumOfn(4));
        // https://chatgpt.com/s/t_68d91e8600e48191ba4848b3f0d64b8d


        // System.out.println(fib(5));
        // https://chatgpt.com/s/t_68da4b30cf4481918ec0846e5b030522


        // int arr[] = {6, 3, 9, 5, 2, 8};
        // mergeSort(arr, 0, arr.length-1);
        // printArr(arr);



        // System.out.println(power(2, 2)); Power Function 1
        // System.out.println(Math.pow(2, 2));


        // System.out.println(power2(2, 3));
        // System.out.println(2/2);
        // System.out.println(1/2);


        System.out.println(power3(2,2));
    }
}
