class Solution {
    public String truncateSentence(String s, int k) {
        String [] words = s.trim().split("\\s+");
        String ans = "";
        for(int i=0;i<=k-1;i++){
            ans = ans + words[i]+ " ";
        }
        return ans.trim();
        
    }
}