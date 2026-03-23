class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Array to store counts of 'a' through 'z'
        int[] counts = new int[26];

        // 1. Add up all characters available in the magazine
        for (char c : magazine.toCharArray()) {
            counts[c - 'a']++; 
        }

        // 2. Subtract characters needed for the ransomNote
        for (char c : ransomNote.toCharArray()) {
            counts[c - 'a']--;
            if(counts[c-'a']<0){
                return false;
            }
        }

        return true;
    }
}
