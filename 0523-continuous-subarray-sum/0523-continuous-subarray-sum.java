class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
    // Store: remainder → earliest index where we saw it
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);  // seed: remainder 0 seen before index 0

    int prefixSum = 0;

    for (int i = 0; i < nums.length; i++) {
        prefixSum += nums[i];
        int remainder = prefixSum % k;

        if (map.containsKey(remainder)) {
            // same remainder seen before — check length ≥ 2
            if (i - map.get(remainder) >= 2) {
                return true;
            }
            // don't update map — we want the EARLIEST index
        } else {
            map.put(remainder, i);
        }
    }
    return false;

        
    }
}