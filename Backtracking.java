public class Backtracking {
    public static void changeArr(int arr[], int i, int val){
        // base case 
        if(i == arr.length){
            printArr(arr);
            return;
        }

        // Recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1); // Funct call step
        arr[i] = arr[i]-2; // backtraking step
    }

    // Find Subset of Strings
    public static void findSubsets(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }
            System.out.println(ans);
            return;
        }

        // Yes Choice
        findSubsets(str, ans+str.charAt(i), i+1);
        // No Choice
        findSubsets(str, ans, i+1);
    }


    //Find Permutations
    public static void findPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(NewStr, ans+curr);
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);


        // String str = "ab";
        // findSubsets(str, "", 0);
        // https://chatgpt.com/s/t_68dbc5243f008191a9e0996e0821e483


        String str = "abc";
        findPermutation(str, "");
    }
}
