class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        int n = word.length();
        
        // Step 1: Count uppercase letters
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCount++;
            }
        }
        
        // Step 2: Check conditions
        // Rule 1: All capitals (upperCount == n)
        // Rule 2: All lowercase (upperCount == 0)
        if (upperCount == n || upperCount == 0) {
            return true;
        }
        
        // Rule 3: Only the first letter is capital
        return upperCount == 1 && Character.isUpperCase(word.charAt(0));
    }
}
