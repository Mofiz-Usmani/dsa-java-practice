import java.util.*;

public class Strings {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
        String str = "abcde";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name.length());  // length of string

        // Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        printLetters(fullName);
    }
}
