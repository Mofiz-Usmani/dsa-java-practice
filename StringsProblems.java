import java.util.*;

public class StringsProblems {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    // Shortest Path
    public static float getPath(String path){
        int x=0, y=0;
        
        for(int i=0; i<path.length(); i++){
                if(path.charAt(i) == 'N'){
                    y++;
                } else if(path.charAt(i ) == 'S'){
                    y--;
                } else if(path.charAt(i) == 'E'){
                    x++;
                } else if(path.charAt(i) == 'W'){
                    x--;
                }     
        }
        int X2 = x*x;
        int Y2 = y*y;
        double result = Math.sqrt(X2 + Y2);
        return (float)result;
    }

    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args){
        String str = "HelloWorld";

        System.out.println(substring(str, 0, 4));

        // String path = "WNEENESENNN"; // Shortest path
        // String str = "lol";  // Palindrome
        // String s1 = "Tony";  // String comparison
        // String s2 = "Tony";  // String comparison
        // String s3 = new String("Tony"); // String comparison

        // if(s1 == s2){
        //     System.out.println("s1 and s2 are same");
        // } else {
        //     System.out.println("s1 and s2 are different");
        // }

        // if(s1 == s3){
        //     System.out.println("s1 and s3 are same");
        // } else {
        //     System.out.println("s1 and s3 are different");
        // }

        // if(s1.equals(s3)){
        //     System.out.println("s1 and s3 are same");
        // } else {
        //     System.out.println("s1 and s3 are different");
        // }


        // Palindrome
        // System.out.println(isPalindrome(str));

        // Shortest path
        // System.out.println(getPath(path));
    }
}
