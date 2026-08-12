class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        //this is definitely a subarray queastion i.e a variable window subarray
        int n = nums.length;
        int left = 0;
        int ans = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0;right<n;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k){
                //remove left and add new
                int updated = map.get(nums[left])-1;
                map.put(nums[left],updated);
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}