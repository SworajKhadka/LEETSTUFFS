class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        //funnction for gcd
        return gcd(min,max);

    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b= a%b;
            a = temp;
            
        }
        return a;
    }
}