class Solution {
    public boolean isSubsequence(String s, String t) {
        //two pointer approach, i and j for scanning two
        if(s.length()<1)return true;
        int j=0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(j)==t.charAt(i)){
                j++;
            }
            if(j==s.length())return true;
        }
        return false;
    }
}