class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int leftsum = 0;
        int rightsum = 0;
        //for left sum loop range should be from 0 to i-1;
        //for right sum loop should range from i+1 to n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<= i-1;j++){

                leftsum = leftsum+nums[j];
            }
            for(int j=i+1;j<n;j++){
                rightsum = rightsum+nums[j];
            }
            ans[i] = Math.abs(leftsum-rightsum);
            leftsum = 0;
            rightsum = 0;
        }
        return ans;
    }
}