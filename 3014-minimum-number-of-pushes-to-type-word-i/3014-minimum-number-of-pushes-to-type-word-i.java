class Solution {
    public int minimumPushes(String word) {
        //main logic you need to think for this is gonna be about the words length and how you're gonan divide the 8 letters into the words
        int n = word.length();
        if(word.length()<=8) return word.length();
        else{
            if(n>8 && n<=16){
                int ans = 8+2*(n-8);
                return ans;
            }
            else if(n>16 && n<=24){
                int sec = 24+3*(n-16);
                return sec;
            }
        }
        int next = 48+4*(n-24);
        return next;
    }
}