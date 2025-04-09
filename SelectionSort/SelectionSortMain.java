public class SelectionSortMain {
    public static void SelectionSort(int[] nums){
        for(int i = 0; i<nums.length-1; i++){
            int minPosition = i;
            for(int j = i+1; j<nums.length; j++){
                if(nums[minPosition]>nums[j]){
                    minPosition = j;
                }
            }
            int temp = nums[minPosition];
            nums[minPosition] = nums[i];
            nums[i] = temp;
        }
        System.out.println("The sorted array is:");
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,4,1,3,2};
        SelectionSort(nums);
    }
}