class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] temp = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            temp[i] = nums[i % n];
        }

        int count = 1;
        int ans = 1;

        for (int i = 0; i < 2 * n - 1; i++) {

            if (temp[i + 1] >= temp[i]) {   // changed
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }

        ans = Math.max(ans, count); // last streak

        return ans >= n;
    }
}