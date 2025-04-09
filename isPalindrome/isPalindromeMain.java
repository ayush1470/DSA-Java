public class isPalindromeMain {
    public static boolean isPalindrome(String str){
        int n=str.length();
        for(int i=0; i<n/2; i++){
            /* n/2 as we have divided the string in two parts, and we are comparing
               each character of first half with the character of second half */
            if(str.charAt(i)!=str.charAt(n-1-i)){  // n-1-i as (n-1) is the last character, and we are going back by i iterations.
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
           String str = "noon";
           System.out.println(isPalindrome(str));
    }
}