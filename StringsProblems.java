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

    // Substring using loop
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    // Capitalize each word
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // String Compression
    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder("");

        char currChar = str.charAt(0);
        int count = 1;

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == currChar){
                count++;
            } else {
                sb.append(currChar);
                if(count > 1){
                    sb.append(count);
                }
                currChar = str.charAt(i);
                count = 1;
            }
        }
        sb.append(currChar);
        if(count > 1){
            sb.append(count);
        }
        return sb.toString();
    }

    // Count lowercase vowels
    public static int lowercaseVowels(String vowels){
        int count = 0;

        for(int i=0; i<vowels.length(); i++){
            if(vowels.charAt(i) == 'a' || vowels.charAt(i) == 'e' || vowels.charAt(i) == 'i' || vowels.charAt(i) == 'o' || vowels.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }

    // Anagrams
    public static boolean isAnagrams(String str, String str2) {
        if (str.length() != str2.length()) {
            return false;
        } 
    
        char[] str1Array = str.toLowerCase().toCharArray();
        char[] str2Array = str2.toLowerCase().toCharArray();
    
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
    
        return Arrays.equals(str1Array, str2Array);
    }


    public static void main(String[] args){
        
        // Anagrams
        // String str = "listen";
        // String str2 = "silent";
        // System.out.println(isAnagrams(str, str2));


        // Count lowercase vowels
        // Scanner sc = new Scanner(System.in);
        // String vowels = sc.nextLine();
        // System.out.println(lowercaseVowels(vowels));

        // String Compression
        // String str = "aaabbcccdd";
        // System.out.println(stringCompression(str));


        // Capitalize each word
        // String str = "hi, i am a learning java";
        // System.out.println(toUpperCase(str));


        // StringBuilder sb = new StringBuilder(""); 
        
        // for(char ch = 'a'; ch <= 'z'; ch++){
        //     sb.append(ch+" ");
        // }

        // sb.toString();

        // System.out.println(sb);
        // System.out.println(sb.length());


        // largest value
        // String fruits[] = {"apple", "mango", "banana"};

        // String largest = fruits[0];

        // for(int i = 1; i < fruits.length; i++){
        //     if(largest.compareTo(fruits[i]) < 0){  
        // // if current 'largest' comes before fruits[i], update
        //         largest = fruits[i];
        //     }
        // }
        
        // System.out.println("Largest fruit (lexicographically): " + largest);


        // Substring using inbuilt function
        // String str = "HelloWorld";
        // System.out.println(str.substring(0,4));

        // Substring using loop
        // String str = "HelloWorld";
        // System.out.println(substring(str, 0, 4));

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
