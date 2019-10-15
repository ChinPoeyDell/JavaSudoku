/**
 * Fibonacci
 */
public class Fibonacci {

    static int findFibonacci(int target) {
       int arr[] = new int[target+2];

       arr[0] = 1;
       arr[1] = 1;

       for (int i = 2; i <= target; i++)
       {
           arr[i] = arr[i-1] + arr[i-2];
       }
        return arr[target];

    }

    public static void main(String[] args){
        System.out.println(findFibonacci(0)); // => 1
        System.out.println(findFibonacci(1)); // => 1
        System.out.println(findFibonacci(2)); // => 2
        System.out.println(findFibonacci(3)); // => 3
        System.out.println(findFibonacci(4)); // => 5
        System.out.println(findFibonacci(5));
        System.out.println(findFibonacci(6));
        System.out.println(findFibonacci(7));
        System.out.println(findFibonacci(8));
        System.out.println(findFibonacci(9));
        System.out.println(findFibonacci(10));
    }

}