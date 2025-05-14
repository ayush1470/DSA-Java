/* LeetCode Problem: (930) Binary Subarrays With Sum */

import java.util.*;

public class BinarySubarraysWithSumMain{
    public static int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1); // sum 0 occurs once initially

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (prefixSumFreq.containsKey(sum - goal)) {
                count += prefixSumFreq.get(sum - goal);
            }

            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args){
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
}

/* Key Logic: - We use a HashMap to store the frequency of prefix sums seen so far.
              - For each element, we maintain a running sum. If (sum - goal) has occurred before,
                then there exists a subarray ending at the current index which sums to 'goal'.
              - We increment the count by the number of times (sum - goal) has been seen.
              - This approach ensures we count all valid subarrays efficiently in O(n) time. */