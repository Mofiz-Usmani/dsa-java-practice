public class PracticeDSA {
    public static void main(String[] args) {

        // // Star Pattern #1:
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // // Star Pattern #2:
        // for(int i=1; i<=4; i++){
        //     for(int j=4; j>i-1; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Star Pattern #3: 
        char ch = 'A';
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
