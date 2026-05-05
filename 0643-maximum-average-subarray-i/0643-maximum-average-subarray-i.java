class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //lets start this off gang
        int n = nums.length;
        double sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        //we calculated the sum of the contiguous subarray of size k
        //now we compute the sum with right including and left excluding
        double ans = sum;
        for(int i=k;i<n;i++){
            sum+=nums[i]; //including the new right element
            sum-=nums[i-k]; //excluding the leftmost element
            ans = Math.max(ans,sum);

        }
        return ans/k;
    }
}