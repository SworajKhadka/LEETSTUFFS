import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int key : nums) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // Convert to Integer list to allow custom sorting
        List<Integer> list = new ArrayList<>();
        for (int n : nums) list.add(n);

        Collections.sort(list, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            
            if (freqA != freqB) {
                return freqA - freqB; // Rule 1: Increasing frequency
            } else {
                return b - a;         // Rule 2: Decreasing value if frequency tied
            }
        });

        // Put sorted values back into the primitive array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        
        return nums;
    }
}
