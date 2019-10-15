/**
 * Fibonacci
 */
public class FibonacciInstuctor {

    static int findFibonacci(int target) {
        // your code
        int firstNum = 1;
        int secondNum = 1;

        if (target == 0) {
            return firstNum;
        }

        if (target == 1) {
            return secondNum;
        }

        for (int i = 2; i <= target; i++) {
            int thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
        }

        return secondNum;
    }

    public static void main(String[] args) {
        System.out.println(findFibonacci(0)==1); // => 1
        System.out.println(findFibonacci(1)== 1); // => 1
        System.out.println(findFibonacci(2)== 2); // => 2
        System.out.println(findFibonacci(3)== 3); // => 3
        System.out.println(findFibonacci(4)== 5); // => 5
        System.out.println(findFibonacci(5)== 8);
        System.out.println(findFibonacci(6)== 13);
        System.out.println(findFibonacci(7)== 21);
    }
}