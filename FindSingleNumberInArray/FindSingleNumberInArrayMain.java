public class FindSingleNumberInArrayMain {
    public static int FindSingleNumber(int[] arr){
        /* We are using the XOR ^ operator to find the Single Number in the array.
           A ^ A = 0,  A ^ 0 = A  [Try these out] */
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans^=arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,5,1,2,2,1};
        System.out.println(FindSingleNumber(arr));
    }
}

// This question also had constraints that Time complexity should be: O(n) and space complexity: O(1).

/* The logic here is that we iterate through the array and XOR the first number with 0 (000 here)
   and store the result in the 'ans' variable. The value stored in 'ans' will be the first number itself.
   Now we XOR 'ans' which has value of first number with the next element of array,
   and the answer of this is going to be the first number if the second element is different
   otherwise if both are same then answer will be 0.
   1^1=0 and 0^0=0
   1^0=1 and 0^1=1 */