class Solution {
    public int deleteAndEarn(int[] nums) {

        int max = 0;

        // Find the maximum number
        for (int num : nums) {
            max = Math.max(max, num);
        }

        // points[i] = total points we can earn by taking number i
        int[] points = new int[max + 1];

        for (int num : nums) {
            points[num] += num;
        }

        // House Robber DP
        int prev2 = 0;  // dp[i - 2]
        int prev1 = 0;  // dp[i - 1]

        for (int i = 1; i <= max; i++) {

            int take = prev2 + points[i];
            int skip = prev1;

            int current = Math.max(take, skip);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}