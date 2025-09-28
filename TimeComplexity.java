public class TimeComplexity {

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


        System.out.println(fact(4));
    }
}
