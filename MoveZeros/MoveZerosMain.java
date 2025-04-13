/* LeetCode Problem: (283) Moves Zeros */

import java.util.*;

public class MoveZerosMain{
    public static int[] moveZeros(int[] nums){
        /* First move all the non-zero elements of the array in the beginning of the array */
        int insertposition = 0;  // starting index
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[insertposition++]=nums[i];  /* Notice the insertposition++ here,
                its purpose is to first use the already initialized value
                of 'insertposition' first and then increment its value [IMP LOGIC]. */
            }
        }
        // Then just add the Zeros in the remaining positions of the array.
        while(insertposition < nums.length) {
            nums[insertposition++] = 0; /* Notice that I dont need to write insertposition++ below
            this statement as this: nums[insertposition++]=0; already does everything that needs
            to be done */
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeros(nums)));
    }
}

/* Key Insight:
You're not trying to preserve the original positions of zeros.
You're overwriting the array with just non-zero elements in order,
and then filling the remaining space with zeros.

So yes — the zeros do get overwritten in the first loop,
but we don’t need them anymore, because we’re deliberately rebuilding the array. */