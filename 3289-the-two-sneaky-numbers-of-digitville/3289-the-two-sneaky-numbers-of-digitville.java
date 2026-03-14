class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n= nums.length;
        int [] freq=new int[n];
        int [] result =new int[2];
        int index=0;
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]==2){
                result[index++]=nums[i];
            }
        }
        return result;
        
    }
}