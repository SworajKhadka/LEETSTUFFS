class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            //if the right most element is smaller,means the shortest is in the right half only 
            if(nums[mid]>nums[right]){
                left = mid+1;
            }
            //else nums[mid]<nums[right] means that smallest can be mid itself or the leftmost values
            else{
                right = mid;
            }
        }
        return nums[left];

    }
}

