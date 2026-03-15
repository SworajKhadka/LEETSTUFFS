class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1="";
        String ans2="";
        for(int i=0;i<word1.length;i++){
            ans1 = ans1+word1[i];
        } 

        for(int j=0;j<word2.length;j++){

            ans2 = ans2+ word2[j];
        }
        return ans1.equals(ans2);
    }
}