import java.util.Arrays;

/**
 * PigLatin
 */
public class PigJavaInstructor {
    static String convert(String word){
       // find the first vowel
       String vowels = "aeiou";
       char[] letters = word.toCharArray();
       int firstVowelIdx = -1;

       for (int i = 0; i < letters.length; i++) {
           char letter = letters[i];

           // check the current letter, is it a vowel
           if (vowels.contains(Character.toString(letter))) {
                firstVowelIdx = i;
                break;
           } 
       }
       
       if (firstVowelIdx == -1) {
           // means no vowel found
           return word + "ay";
       }

       if (firstVowelIdx == 0) {
        // means no vowel found
            return word;
        }

        // means vowel is not the first letter
        // split the word into 2 halves and reorder + ay
        String firstHalf = word.substring(0, firstVowelIdx);
        String secondHalf = word.substring(firstVowelIdx);

        return secondHalf + firstHalf + "ay";
    }

    public static void main(String[] args){
        System.out.println(convert("art").equals("art"));
        System.out.println(convert("vowel").equals("owelvay"));
        System.out.println(convert("nginx").equals("inxngay"));
        System.out.println(convert("hello").equals("ellohay"));
        System.out.println(convert("Dr").equals("Dray"));
    }
}