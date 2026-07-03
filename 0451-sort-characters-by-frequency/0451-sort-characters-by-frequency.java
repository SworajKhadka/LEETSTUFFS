class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find maximum frequency
        int max = 0;
        for (int freq : map.values()) {
            max = Math.max(max, freq);
        }

        StringBuilder ans = new StringBuilder();

        // From highest frequency to lowest
        for (int freq = max; freq >= 1; freq--) {

            // Check every character
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                if (entry.getValue() == freq) {

                    // Append the character 'freq' times
                    for (int i = 0; i < freq; i++) {
                        ans.append(entry.getKey());
                    }
                }
            }
        }

        return ans.toString();
    }
}