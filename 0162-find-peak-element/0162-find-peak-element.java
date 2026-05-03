class Solution {
    public int findPeakElement(int[] nums) {
        //use the basic template as usual
        int left = 0;
        int n = nums.length;
        int right = n-1;
        while(left<right){
            int mid = left+(right-left)/2;
            //check on which side is the slope
            //upward slope condition
            if(nums[mid]<nums[mid+1]){
                //ans lies in right side 
                left = mid+1;
            }
            //downward slope condition
            else if (nums[mid]>nums[mid+1]){
                //ans lies in the left side , mid maybe too
                right  = mid;
            }
        }
        return left;

    }
}