class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int MaxD = 0;
        int diff =0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(colors[i]!=colors[j]){
                diff = Math.abs(j-i);
                MaxD= Math.max(MaxD,diff);
            }
            }
        }
        return MaxD;
        
    }
}