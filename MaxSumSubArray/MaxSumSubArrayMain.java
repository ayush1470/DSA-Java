public class MaxSumSubArrayMain {
    public static void KadanesMaxSum(int[] numbers) {  // Time Complexity: O(n)
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; ++i) {
            currentSum += numbers[i];
            if (currentSum < 0) {
                currentSum = 0;
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        if (maxSum == 0) {  // Test case for Array with only negative Integer elements
            maxSum = numbers[0];

            for(int i = 1; i < numbers.length; ++i) {
                if (numbers[i] > maxSum) {
                    maxSum = numbers[i];
                }
            }
        }

        System.out.println("The maximum Sum of Sub array by using Kadane's Algorithm is: " + maxSum);
    }

    public static void PrefixSumMaxSubArray(int[] numbers) {  // Time Complexity: O(n^2)
        int maxSum = Integer.MIN_VALUE;  // initializes -Infinity to maxSum
        int minSum = Integer.MAX_VALUE;  // initializes +Infinity to minSum
        int[] prefixArray = new int[numbers.length];
        prefixArray[0] = numbers[0];

        int i;
        for(i = 1; i < numbers.length; ++i) {
            prefixArray[i] = prefixArray[i - 1] + numbers[i];
        }

        for(i = 0; i < numbers.length; ++i) {

            for(int j = i; j < numbers.length; ++j) {
                int currentSum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }

                if (currentSum < minSum) {
                    minSum = currentSum;
                }
            }
        }

        System.out.println("The max Sum is: " + maxSum);
        System.out.println("The min Sum is: " + minSum);
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{-3, -2, 1, -9, 6};
        PrefixSumMaxSubArray(numbers);
        KadanesMaxSum(numbers);
    }
}