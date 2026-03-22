class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // Since values are 1-1000, we use a fixed-size frequency array
        int[] counts = new int[1001];
        
        for (int i = 0; i < target.length; i++) {
            counts[target[i]]++; // Increment for elements in target
            counts[arr[i]]--;    // Decrement for elements in arr
        }
        
        // If arrays have same elements/frequencies, all counts will be 0
        for (int count : counts) {
            if (count != 0) return false;
        }
        
        return true;
    }
}
