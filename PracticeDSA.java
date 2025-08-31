public class PracticeDSA {
    public static void main(String[] args) {
        
        // Star Pattern

        for(int i=1; i<=4; i++){
            for(int j=4; j>i-1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
