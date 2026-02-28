class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums.length==1){
                return nums[0];
            }
            if(mid==0){
                if(nums[0]!=nums[1])return nums[mid];
            }
            else if (mid==n-1){
                if(nums[mid]!=nums[mid-1])return nums[mid];
            }

            else{
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if(mid%2==0){
                if(nums[mid]==nums[mid-1]){
                    right=mid-1;
                }
                else left = mid+1;
                
                }
            else {
                if(nums[mid]==nums[mid-1]){
                    left = mid+1;
                }
                else right = mid-1;
            }
            }
            
        }
        return -1;
    }
}