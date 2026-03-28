class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            // Check if both 'a' and 'b' contain no zeros
            if (isNoZero(a) && isNoZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{}; // Should not reach here per constraints
    }

    private boolean isNoZero(int num) {
        while (num > 0) {
            // If the last digit is 0, it's not a 'No-Zero' integer
            if (num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
