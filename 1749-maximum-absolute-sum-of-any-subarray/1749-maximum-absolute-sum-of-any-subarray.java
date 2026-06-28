class Solution {
    public int maxAbsoluteSum(int[] nums) {
        //since this is kinda related to KADANE's algo
        //lets follow his approach
        int currsum1 = nums[0];
        int maxsum1 = nums[0];
        int currsum2 = nums[0];
        int maxsum2 = nums[0];
        int n = nums.length;
        //running kadane for max sum;
        for(int i=1;i<n;i++){
            currsum1 = Math.max(currsum1+nums[i],nums[i]);
            maxsum1 = Math.max(currsum1,maxsum1);
        }
        //running kadane for min sum;
        for(int i=1;i<n;i++){
            currsum2 = Math.min(currsum2+nums[i],nums[i]);
            maxsum2 = Math.min(currsum2,maxsum2);
        }
        return Math.max(maxsum1,Math.abs(maxsum2));

    }
}