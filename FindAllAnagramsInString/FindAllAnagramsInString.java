/* LeetCode Problem: (438) Find All Anagrams in a String */

import java.util.*;

public class FindAllAnagramsInString{
    public static ArrayList<Integer> findAnagrams(String s, String p){
        ArrayList<Integer> result = new ArrayList<>();
        if(s.length() < p.length()) return result;

        int[] count = new int[26];

        // Count characters in p
        for(char c : p.toCharArray()){
            count[c - 'a']++;
        }

        int left = 0, right = 0, remaining = p.length();

        while(right < s.length()){
            // If character is part of p, decrement remaining
            if(count[s.charAt(right) - 'a'] > 0){
                remaining--;
            }
            count[s.charAt(right) - 'a']--;
            right++;

            // If remaining == 0, it's an anagram
            if(remaining == 0){
                result.add(left);
            }

            // Window size reached, move left pointer
            if(right - left == p.length()){
                if(count[s.charAt(left) - 'a'] >= 0){
                    remaining++;
                }
                count[s.charAt(left) - 'a']++;
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
}

/* Key Logic: 1. Count frequency of each character in string p using a count array of size 26.
              2. Use a sliding window of length p.length() on string s:
                  - For every character entering the window (right pointer), decrease its count.
                  - If the count was > 0, it means it matched a needed character → so decrease
                    'remaining'.
              3. When 'remaining' becomes 0 → current window is a valid anagram → add 'left'
                 index to result.
              4. If window size exceeds p.length(), move the left pointer:
                  - Increase count of the character leaving the window.
                  - If count becomes > 0, it means we now miss this character → increase 'remaining'.
              5. Repeat till the end of string s. */