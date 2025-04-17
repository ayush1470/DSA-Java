import java.util.*;

public class MaximumGapMain {
    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int L = 0;
        int R = L + 1;
        int diff;
        int maxdiff = 0;
        if(nums.length == 1){
            return 0;
        }
        while(R < nums.length){
            diff = nums[R] - nums[L];
            maxdiff = Math.max(maxdiff, diff);
            L++;
            R = L + 1;
        }
        return maxdiff;
    }

    public static void main(String[] args){
        int[] nums = {3,6,9,1};
        System.out.println(maximumGap(nums));
    }
}