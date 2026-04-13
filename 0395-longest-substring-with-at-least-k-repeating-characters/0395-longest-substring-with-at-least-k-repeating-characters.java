class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s, k);
    }

    private int helper(String s, int k) {
        if (s.length() < k) return 0;

        // frequency map
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // find invalid character
        for (char c : map.keySet()) {
            if (map.get(c) < k) {
                
                int max = 0;
                for (String part : s.split(String.valueOf(c))) {
                    max = Math.max(max, helper(part, k));
                }
                
                return max;
            }
        }

        // all characters valid
        return s.length();
    }
}