class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n=arr1.length;
        int m=arr2.length;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int dis = Math.abs(arr1[i]-arr2[j]);
                if(dis>d){
                    count1++;
                }
            }
            if(count1==m)count2++;
            count1=0;

        }
        return count2;
        
    }
}