class Solution {
    public int firstMatchingIndex(String s) {
        int ans= Integer.MAX_VALUE;
        int n= s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                ans = Math.min(ans,i);
            }
        }
        if(ans!=Integer.MAX_VALUE)return ans;
        else return -1;
    }
}