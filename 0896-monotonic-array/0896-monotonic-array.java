class Solution {
    public boolean isMonotonic(int[] nums) {
        int n =nums.length;
        int count1=0;
        int count2=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                count1++;
            }
            if(nums[i]<=nums[i+1]){
                count2++;
            }
        }
        return count1==n-1||count2==n-1;
    }
}