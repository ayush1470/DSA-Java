// In this, I have used Sliding Window Algorithm

public class MaximumConsecutiveZerosInBinaryArrayMain {
    public static int CountLargestZeroSubarrays(int[] arr) {
        int Lptr = 0, maxCount = 0;
        for (int Rptr = 0; Rptr < arr.length; Rptr++) {
            if (arr[Rptr] == 1) {
                Lptr = Rptr + 1;   /* if arr[Rptr]==1, then move the Left Pointer and eventually the Right Pointer to the next element
                                      {start creating a new window from the next element of the array} */
            }
            maxCount = Math.max(maxCount, Rptr - Lptr + 1);  /* Here, (Rptr - Lptr + 1) represents the length of the sliding window.
                                                                And here we are comparing the length of each window containing only zeros
                                                                to figure out which window length is the maximum. */
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,0,1,0,1,1,1,0,0,0,0,0,1,1,0,1};
        System.out.println(CountLargestZeroSubarrays(arr));
    }
}
