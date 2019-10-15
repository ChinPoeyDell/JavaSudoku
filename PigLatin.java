import java.util.ArrayList;
import java.util.Arrays;

/**
 * PigLatin
 */
public class PigLatin {
    static boolean isVowel(Character c) {
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || 
        c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'); 
    }
    
    static String convert(String word){
       int len = word.length();
       int index = 0;
       for (int i = 0; i < len; i++)
       {
           if (isVowel(word.charAt(i))) {
               index = i;
               break;
           }
       }

       if (index == 0){
       return word;
        }
       else {
       return word.substring(index) + word.substring(0, index) + "ay";
       }
    }

    public static void main(String[] args){
        // System.out.println(convert("art").equals("art"));
        // System.out.println(convert("vowel").equals("owelvay"));
        // System.out.println(convert("nginx").equals("inxngay"));
        // System.out.println(convert("hello").equals("ellohay"));
        System.out.println(convert("Dr").equals("Dray"));
    }
}


// Javascript
// function sum(x,y) {
//     return x + y;
// }

// TypeScript
// function sum(x: int,y: int): int {
//     return x + y;
// }

// Java
// int sum(int x, int y) {
//     return x + y;
// }