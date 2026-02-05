class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        long expectedSum = (long) N * (N + 1) / 2;
        long expectedSqSum = (long) N * (N + 1) * (2 * N + 1) / 6;

        long actualSum = 0;
        long actualSqSum = 0;

        for (int[] row : grid) {
            for (int num : row) {
                actualSum += num;
                actualSqSum += (long) num * num;
            }
        }

        long diff = expectedSum - actualSum;
        long sqDiff = expectedSqSum - actualSqSum;

        long sum = sqDiff / diff;

        int missing = (int) ((diff + sum) / 2);
        int repeated = (int) (missing - diff);

        return new int[]{repeated, missing};
    }
}
