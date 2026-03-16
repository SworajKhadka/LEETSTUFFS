class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int second = 0;
        for(int x:nums){
            if(x>max){
                second = max;
                max = x;
            }
            else if (x>second){
                second = x;
            }
        }
        return (max-1)*(second-1);
    }
}