public class RecursionBasics {

    // Print form n to 1
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }


    // Print from 1 to n
    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }


    // Factorial of a Number
    public static int fact(int n) {
        if(n == 0){
            return 1;
        }
        int fn = n * fact(n-1);
        return fn;
    }


    // Print Sum of first n natural numbers
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }

        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }


    // Print Nth fibonacci Number
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }


    // Check if a give array is sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }


    // WAF to find the first Occurance of an element in an array
    public static int firstOccurnace(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOccurnace(arr, key, i+1);
    }


    // WAF to find the last Occurance of an element in an array
    public static int lastOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }


    // Print x^n 
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }



    // Optimized x^n
    public static int optimizedPower(int x, int n) {
    if (n == 0) return 1;

    int half = optimizedPower(x, n/2);

    if (n % 2 == 0) {
        return half * half;
    } else {
        return x * half * half;
    }
    }



    // Tiling Problem
    public static int tilingProblem(int n){

        if(n == 0 || n == 1){
            return 1;
        }

        // Vertical Choice
        int fnm1 = tilingProblem(n-1);

        // Horizontal Choice
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }




    // Remove Duplicates from a string
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }


    public static void main(String[] args) {
        // int n = 5;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(calcSum(n));
        // System.out.println(fib(n)); (https://chatgpt.com/s/t_68c3c11dfed88191a148d2e4d4bc8dc9)
        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurnace(arr, 5, 0));
        // System.out.println(lastOccurance(arr, 3, 0));
        // System.out.println(power(2, 4));
        // System.out.println(optimizedPower(2, 3));
        // System.out.println(tilingProblem(2));
        // https://chatgpt.com/s/t_68ca4d8b37208191ae600298bac0a539

        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
