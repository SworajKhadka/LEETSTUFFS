class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = n-1;
        int j = n-2;
        int pr = (nums[i]-1)*(nums[j]-1);
        return pr;
    }
}