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


    // Quick Sort
    public static void quickSort(int arr[], int si, int ei) {
        // Base case: if there is only 1 element or invalid range, return
        if (si >= ei) {
            return;
        }

        // Find the pivot index
        int pIdx = partition(arr, si, ei);

        // Recursively sort the left half
        quickSort(arr, si, pIdx - 1);

        // Recursively sort the right half
        quickSort(arr, pIdx + 1, ei);
    }

    // Partition function to place pivot in correct position (Quick Sort)
    public static int partition(int arr[], int si, int ei) {
    int pivot = arr[ei];  // last element as pivot
    int i = si - 1;       // boundary for smaller elements

    for (int j = si; j < ei; j++) {
        if (arr[j] <= pivot) {
            i++;
            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // place pivot in its correct sorted position
    int temp = arr[i + 1];
    arr[i + 1] = arr[ei];
    arr[ei] = temp;

    return i + 1;  // return pivot index
   }



   // Search in a sorted and rotated array
     public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {  // base case: not found
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // Check if mid is the target
        if (arr[mid] == tar) {
            return mid;
        }

        // Check which side is properly sorted
        if (arr[si] <= arr[mid]) {  // left half is sorted
            if (tar >= arr[si] && tar < arr[mid]) {
                // Target is in left half
                return search(arr, tar, si, mid - 1);
            } else {
                // Target is in right half
                return search(arr, tar, mid + 1, ei);
            }
        } else {  // right half is sorted
            if (tar > arr[mid] && tar <= arr[ei]) {
                // Target is in right half
                return search(arr, tar, mid + 1, ei);
            } else {
                // Target is in left half
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        // int arr[] = {4, 5, 6, 7, 0, 1, 2};
        // int tar = 6;
        // int ans = search(arr, tar, 0, arr.length - 1);
        // System.out.println(ans);
        // https://chatgpt.com/s/t_68d23b2a254c819197f4c1f8dbf4aa24


        // int arr[] = {6, 3, 9, 8, 2, 5};
        // quickSort(arr, 0, arr.length - 1);
        // printArr(arr);
        // https://chatgpt.com/s/t_68d22ca60bec819188c4a3a344d8148f

        // int arr[] = {6, 3, 9, 5, 2, 8};
        // mergeSort(arr, 0, arr.length-1);
        // printArr(arr);
    }
}
