public class RecurringNumbersMain {
    public static boolean RecurringNumbers(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){  // j=i+1 is important
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(RecurringNumbers(nums));
    }
}