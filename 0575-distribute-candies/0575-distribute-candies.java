class Solution {
    public int distributeCandies(int[] candyType) {
        // Step 1: Count unique candy types using a HashSet
        Set<Integer> uniqueTypes = new HashSet<>();
        for (int type : candyType) {
            uniqueTypes.add(type);
        }

        // Step 2: Return the minimum of (n/2) and unique candy count
        return Math.min(candyType.length / 2, uniqueTypes.size());
    }
}
