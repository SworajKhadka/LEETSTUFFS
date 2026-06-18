class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int ans = 0;

        // your transform: 0 → -1, 1 → +1
        for(int i = 0; i < n; i++){
            nums[i] = (nums[i] * 2) - 1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // handles subarrays starting from index 0

        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(map.containsKey(sum)){
                ans = Math.max(ans, i - map.get(sum)); // repeated sum found
            } else {
                map.put(sum, i); // first time seeing this sum
            }
        }
        return ans;
    }
}