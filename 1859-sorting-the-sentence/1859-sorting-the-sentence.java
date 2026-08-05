class Solution {
    public String sortSentence(String s) {
        //lets split the sentence first
        String [] words = s.trim().split("\\s+");
        int n = words.length;
        String [] ans = new String[n];
        for(String w:words){
            int l = w.length();
            int num = w.charAt(l - 1) - '0';
            ans[num - 1] = w.substring(0, l - 1);
        }
        //now lets convert that into a string 
        String done = String.join(" ",ans);
        return done;
    }
}