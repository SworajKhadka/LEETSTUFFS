class Solution {
    public int removeDuplicates(int[] nums) {
        //similar like the previous approach
        int insertIndex = 2; // First two elements are always allowed
    
        for (int j = 2; j < nums.length; j++) {
        // Compare with the element 2 positions behind the allowed boundary
        if (nums[j] != nums[insertIndex - 2]) {
            nums[insertIndex] = nums[j];
            insertIndex++;
        }
    }
    return insertIndex;
    }
}