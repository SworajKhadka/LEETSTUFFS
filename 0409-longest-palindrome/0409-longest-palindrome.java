import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        // Step 2: Build palindrome length
        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                length += freq; // take all
            } else {
                length += freq - 1; // take even part
                hasOdd = true;      // mark odd exists
            }
        }

        // Step 3: Add center character if possible
        if (hasOdd) length += 1;

        return length;
    }
}