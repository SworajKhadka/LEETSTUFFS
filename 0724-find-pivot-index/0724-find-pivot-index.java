class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        //sumleft array 
        //sunright array
        //equal then return the index, else return -1
        int []sumleft = new int[n];
        int []sumright = new int[n];
        sumleft[0]=0;
        for(int i=1;i<n;i++){
            sumleft[i]=sumleft[i-1]+nums[i-1];
        }
        int sum = 0;
        for(int i:nums){
            sum+=i;            
        }
        for(int i=0;i<n;i++){
            sum-=nums[i];
            sumright[i]=sum;
        }
        for(int i = 0;i<n;i++){
            if (sumleft[i] ==sumright[i]){
                return i;
            }
        }
        return -1;
    }
}