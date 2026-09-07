class Solution {
    public boolean canAliceWin(int[] nums) {
        //lets find out the single digit numbers in the nums array
        int n = nums.length;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<10){
                sum1+=nums[i];
            }
            else{
                sum2+=nums[i];
            }

        }
        return sum1!=sum2;
       
    }
}