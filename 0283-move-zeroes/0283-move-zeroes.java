class Solution {
    public void moveZeroes(int[] nums) {
        int j =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];

            }
        }

        for(int k=j;k<nums.length;k++){
            nums[k]=0;
        }
        for (int l=0;l<nums.length;l++){
            System.out.print(nums[l]);
        }


    }
}