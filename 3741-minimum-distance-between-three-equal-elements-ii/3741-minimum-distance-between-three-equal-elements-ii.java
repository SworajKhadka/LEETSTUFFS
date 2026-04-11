class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (!map.containsKey(num)) {
                map.put(num, new int[]{-1, i}); // [second_last, last]
            } else {
                int[] arr = map.get(num);

                if (arr[0] != -1) {
                    // we have 3rd occurrence
                    int dist = i - arr[0];
                    minDist = Math.min(minDist, dist);
                }

                // shift indices
                arr[0] = arr[1];
                arr[1] = i;
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist * 2;
    }
}