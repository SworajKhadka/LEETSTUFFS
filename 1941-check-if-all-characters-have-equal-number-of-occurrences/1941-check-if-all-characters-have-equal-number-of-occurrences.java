class Solution {
    public boolean areOccurrencesEqual(String s) {
        int [] freq = new int[26];
        int count =0;
        char [] ans = s.toCharArray();
        int n = s.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(char c:ans){
            count = freq[c-'a'];
        }
        for(char c:ans){
            if(freq[c-'a']!=count)return false;
        }
        return true;
        
    }
}