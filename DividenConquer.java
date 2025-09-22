public class DividenConquer {
    
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void mergeSort(int arr[], int si, int ei) {
    // Base case: if there is only 1 element or invalid range, return
    if (si >= ei) {
        return;
    }

    // Find the middle index
    int mid = si + (ei - si) / 2;

    // Recursively sort the left half
    mergeSort(arr, si, mid);

    // Recursively sort the right half
    mergeSort(arr, mid + 1, ei);

    // Merge the two sorted halves
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



    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
