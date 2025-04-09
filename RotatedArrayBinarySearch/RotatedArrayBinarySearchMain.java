public class RotatedArrayBinarySearchMain {
    // to find the minimum number in the sorted array
    public static int FindMinNumber(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid>0 && nums[mid-1] > nums[mid]){
                return mid;
                /* iss condition ka use isliye kiya hai taaki hum find out kar sake ki rotation kaha se shuru hui hai (array me
                   which in turn will give us the smallest element in Array kyuki
                   smallest element se hi shuru hoti hai rotation of Array) */

            }else if(nums[mid] >= nums[left] && nums[mid] > nums[right]){
                left = mid + 1;
                /* iss condition ko isliye use kiya hai taaki hum smallest number kaha potentially lie karta hai use map out kar sake
                   (for ex. kya woh mid ke left side me hai ya right side me hai mid ke humara smallest element) */
            }else{
                right = mid - 1;
            }
        }
        return left; /* for the condition jab left == right ho jaega toh while condition terminate ho jaegi
                        (for the example case [0,1,2,4,5,6,7] isme last iteration me mid=0 ho jaega aur left==right=0 ho jaega) */
    }

    /* this function ka use ye hai ki hum figure out kar sake ki humara target kaha lie karta hai
    (left sorted part ya Right sorted part me (Sorted isliye as Rotated Array hai)) */
    public static int search(int[] nums, int target){
        int min = FindMinNumber(nums);
        if(nums[min] <= target && target <= nums[nums.length-1]){
            /* if yes then Target is in Right sorted part,
               if no then Target lies in left Sorted part
               Logic: Right side wale numbers left wale side wale numbers se chote hai as Array is rotated array*/
            return search(nums,min,nums.length-1,target);
        }else{
            return search(nums,0,min,target);
        }
    }

    // After we figure out which side our target is(whether left or right):
    // we use this Function to use Binary Search to find target in left or right Sorted side of Array
    public static int search(int[] nums, int left, int right, int target){
        int l = left;
        int r = right;
        while(l<=r){  // <= isliye taaki koi aisa case jaha l==r ho rha ho toh infinite loop na jae
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1; // for the case jab Target lie hi na karta ho array me
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 6;
        int result = search(nums,target);
        System.out.println("The index of Target is: "+ result);
    }
}
