/* LeetCode Problem: (541) Reverse String II */

public class ReverseStringIIMain{
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();  /* We are creating an array arr which has all elements
                                          of Array as characters of the String s */
        for(int i=0; i<arr.length; i += 2*k){  /* i+=2*k as we are iterating in 2*k blocks and reversing
                                                      first k in that 2*k block of characters */
             int left = i;
             int right = Math.min(i + k - 1, arr.length - 1);  /* For case when because of 'i', 'right'
                                                                     exceeds the arr.length limit. */
             while(left < right){
                  char temp = arr[left];
                  arr[left] = arr[right];
                  arr[right] = temp;
                  left++;
                  right--;
             }

        }
        return new String(arr);  /* We again convert the char[] array 'arr' to String like this
                                    When you do this, you are calling this Constructor:
                                    public String(char[] value)
                                    This constructor takes a char array and creates
                                    a new String object from it. */
    }

    public static void main(String[] args){
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s,k));
    }
}

/* Key Logic: - Convert the string to a char array to allow in-place swapping.
              - For every block of 2k characters, reverse the first k characters:
                   - Set left = current index, right = min(current index + k - 1, end of array).
                   - Swap characters between left and right pointers.
              - If the remaining characters are fewer than k, reverse all of them.
              - Finally, convert the modified char array back into a string and return. */