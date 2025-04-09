public class BubbleSortMain {
    public static void BubbleSort(int[] nums){
        for(int turn = 0; turn<nums.length-1; turn++){
            int swapCount=0;  /* We are doing this to Optimize Bubble Sort
                                 (for the case 1,2,3,4,5 the previous sorting would still give
                                 time complexity as O(n^2), but now the Time Complexity is O(n).) */
            for(int j = 0; j<nums.length-1; j++){
                if(nums[j]>nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapCount++;
                }
            }
            if(swapCount == 0){
                break;
            }
        }
        System.out.println("The sorted array is: ");
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,4,1,3,2};
        BubbleSort(nums);
    }
}