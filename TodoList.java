import java.util.ArrayList;
import java.util.Arrays;

/**
 * TodoList
 */
public class TodoList {

    public static void main(String[] args) {
        // String x = "1. [ ] Shop for Groceries";
        // String y = "2. [X] Analyze Oct sales data";
        // String z = "3. [ ] Prepare project brief";

        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);

        String[] arr = {"1. [ ] Shop for Groceries", 
        "2. [X] Analyze Oct sales data", 
        "3. [ ] Prepare project brief"};

        // for (int i = 0; i < x.length; i++) {
        //     System.out.println(x[i]);
        //   }

        // convert string array to a string arraylist
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(arr));
        // only arraylist can add/remove elements from the array
        arr2.add("4. [ ] Do Homework");

        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr2.get(i));
        }
    }
}
