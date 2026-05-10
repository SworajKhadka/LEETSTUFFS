class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];  // freq of chars in current window
        int left = 0;
        int maxFreq = 0;           // highest freq of any single char in window
        int best = 0;

        for (int right = 0; right < s.length(); right++) {
            // expand: bring in right char
            int rc = s.charAt(right) - 'A';
            freq[rc]++;

            // update maxFreq — only the incoming char can raise it
            maxFreq = Math.max(maxFreq, freq[rc]);

            // if replacements needed exceed k, shrink from left
            // window size = right - left + 1
            // replacements needed = windowSize - maxFreq
            if ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
                // NOTE: we don't recompute maxFreq here — read the insight below
            }

            // window is now valid — update best
            // (window size is always right - left + 1 after the shrink above)
            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}