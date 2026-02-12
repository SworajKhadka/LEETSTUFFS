class Solution {
    public String reverseWords(String s) {
        String [] words = s.trim().split("\\s+");
        int n = words.length;
        StringBuilder ans = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            ans.append(words[i]+ " ");
        }
        String finalans= ans.toString().trim();
        return finalans;


        
    }
}