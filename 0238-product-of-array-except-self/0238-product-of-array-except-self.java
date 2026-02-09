class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int[] ans = new int[n];
       int mul = 1;
       int count = 0;
       // Calculate product of all non-zero elements and count zeros
       for (int i = 0; i < n; i++) {
           if (nums[i] == 0) {
               count++;
           } else {
               mul *= nums[i];
           }
       }
       // Fill the answer array
       for (int i = 0; i < n; i++) {
           if (nums[i] != 0) {
               if (count == 0) {
                   ans[i] = mul / nums[i]; // No zeros, normal division
               } else {
                   ans[i] = 0; // If there's a zero, this element becomes 0
               }
           } else {
               if (count == 1) {
                   ans[i] = mul; // If only one zero, put the product
               } else {
                   ans[i] = 0; // If more than one zero, everything is 0
               }
           }
       }
       return ans;
   }
}
