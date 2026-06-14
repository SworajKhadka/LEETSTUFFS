class Solution {
    public int findMiddleIndex(int[] nums) {
        //prefix sum problem
        int n = nums.length;
        int [] prefix = new int[n];
        int [] suffix = new int[n];
        prefix[0]=0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+nums[i-1];
        }
        //similarly for suffix
        suffix[n-1]=0;
        for(int i=0;i<n-1;i++){
            sum=sum-nums[i];
            suffix[i]=sum;
        }

        for(int i=0;i<n;i++){
            if(prefix[i]==suffix[i])return i;
        }
        return -1;
    }
}