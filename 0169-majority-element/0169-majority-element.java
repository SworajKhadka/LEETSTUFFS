import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            // optimization: check during insertion
            if (map.get(num) > n / 2) {
                return num;
            }
        }

        return -1; // in case majority not guaranteed
    }
}