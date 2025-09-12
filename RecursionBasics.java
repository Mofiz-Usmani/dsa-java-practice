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

    public static void main(String[] args) {
        int n = 5;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(calcSum(n));
        System.out.println(fib(n));
    }
}
