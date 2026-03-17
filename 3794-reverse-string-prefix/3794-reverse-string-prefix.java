class Solution {
    public String reversePrefix(String s, int k) {
        String ans ="";
        char[] characters = s.toCharArray();
        for(int i=k-1;i>=0;i--){
            ans = ans + characters[i];
        }
        for(int i = k;i<characters.length;i++){
            ans = ans+characters[i];
        }
        return ans;
    }
}
