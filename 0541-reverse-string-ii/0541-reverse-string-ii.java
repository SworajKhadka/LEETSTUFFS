class Solution {
    public String reverseStr(String s, int k) {
        // 1. Convert String to char array for mutability
        char[] arr = s.toCharArray();
        int n = arr.length;

        // 2. Iterate through the string in chunks of 2k
        for (int i = 0; i < n; i += 2 * k) {
            // 3. Define boundaries for reversal
            // Start is always 'i', end is the smaller of i+k-1 or the array end
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            // 4. Standard Two-Pointer Swap
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        // 5. Convert modified array back to a String
        return new String(arr);
    }
}
