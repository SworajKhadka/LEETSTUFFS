class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int k = t.indexOf(s.charAt(i));
            sum = sum+ Math.abs(i-k);
        }
        return sum;
    }
}