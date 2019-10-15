/**
 * BinarySearch
 */
public class BinarySearch {

    static int bsearch(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;

		while (start <= end) {
			
			int middle = (start + end) / 2;
			
			if (target < array[middle]) {
				end = middle - 1;
			}

			if (target > array[middle]) {
				start = middle + 1;
			}
			
			if (target == array[middle]) {
				return middle;
			}
		}
		return -1;
      }
    
      public static void main(String[] args) {
        int[] arr = {7,9,21,42,58,67,88};
    
        System.out.println(bsearch(arr, 67) == 5);
        System.out.println(bsearch(arr, 9) == 1);
      }
    
}