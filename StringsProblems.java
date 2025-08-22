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

    public static void main(String[] args){
        String path = "WNEENESENNN";
        String str = "lol";

        // Palindrome
        // System.out.println(isPalindrome(str));

        // Shortest path
        System.out.println(getPath(path));
    }
}
