class Solution {
    public int rob(int[] nums) {
        if(nums ==null)return 0;
        if(nums.length==1)return nums[0];
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0],nums[1]);
        int n = nums.length;
        for(int i=2;i<n;i++){
            int curr = Math.max(prev1,nums[i]+prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}