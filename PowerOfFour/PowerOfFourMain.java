/* LeetCode Problem: (342) Power Of Four */

public class PowerOfFourMain {
    public static boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 4 != 0){
            return false;
        }
        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args){
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
}

/* Key Logic: Base case: 1 is 4^0, so it's a power of 4.
              If n is less than or equal to 0 or not divisible by 4,
              it's not a power of 4.
              Recursively divide by 4 and check if we reach 1. */
