class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        int n = accounts.length;
        int m = accounts[0].length;
        for(int i= 0;i<n;i++){
            int sum = 0;
            for(int  j = 0;j<m;j++){
                sum+= accounts[i][j];
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}