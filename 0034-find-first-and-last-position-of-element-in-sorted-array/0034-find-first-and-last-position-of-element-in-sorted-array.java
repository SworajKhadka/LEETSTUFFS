class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findBound(nums, target, true);  // Find first occurrence
        result[1] = findBound(nums, target, false); // Find last occurrence
        return result;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                index = mid; // Record candidate index
                if (isFirst) {
                    right = mid - 1; // Keep searching left for earlier occurrence
                } else {
                    left = mid + 1;  // Keep searching right for later occurrence
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}
