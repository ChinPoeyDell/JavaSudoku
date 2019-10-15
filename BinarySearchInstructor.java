/**
 * BinarySearch
 */
public class BinarySearchInstructor {
    static int bsearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while(true) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                // narrow down to lower half
                high = mid - 1;
            } else if (array[mid] < target) {
                // narrow down to upper half
                low = mid + 1;
            }
        }
        
      }
    
      public static void main(String[] args) {
        int[] arr = {7,9,21,42,58,67,88};
    
        System.out.println(bsearch(arr, 67) == 5);
        System.out.println(bsearch(arr, 9) == 1);
      }
}