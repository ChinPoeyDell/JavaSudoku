/**
 * Name
 */
public class Name {

    public static void main(String[] args) {
        String name = "John";
        char[] letters = name.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}