class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            String ans="";
            int l = s.length();
            for(int i=l-1;i>=0;i--){
                ans = ans+s.charAt(i);
            }
            if(ans.equals(s))return s;
        }
        return "";
    }
}