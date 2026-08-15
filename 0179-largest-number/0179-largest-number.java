import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        // 1. Convert the int array into a String array
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        
        // 2. Sort the strings using a custom rule:
        // If (B + A) is greater than (A + B), put B before A.
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        
        // 3. Edge Case: If the largest number is "0", the whole result is just "0"
        // (Prevents returning "000" for an input like)
        if (strNums[0].equals("0")) {
            return "0";
        }
        
        // 4. Combine them using StringBuilder (exactly like your approach!)
        StringBuilder sb = new StringBuilder();
        for (String str : strNums) {
            sb.append(str);
        }
        
        return sb.toString();
    }
}
