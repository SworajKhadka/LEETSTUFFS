class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            //to check the duplicate cases 
            if(nums[left]==nums[mid]&&nums[mid]==nums[right]){
                left++;
                right--;
            }
            //to check if the min element lies in the right side
            else if(nums[mid]>nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }

        }
        return nums[left];
    

        
    }
}