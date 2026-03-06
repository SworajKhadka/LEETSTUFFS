class Solution {

    public int[] sortArray(int[] nums) {
        //we just have to call the function to do the work
        divide(nums,0,nums.length-1);
        return nums;

    }
    private void divide(int[]nums, int left, int right){
        if(left>=right) return;
        int mid = left+(right-left)/2;
        divide(nums,left,mid);
        divide(nums,mid+1,right);
        conquer(nums,left,mid,right);
    }
    private void conquer(int []nums,int left, int mid, int right){
        int [] merge = new int[right-left+1];
        int indx1=left;
        int indx2=mid+1;
        int x=0;
        while(indx1 <= mid && indx2 <= right){
            if(nums[indx1]<=nums[indx2]){
                merge[x++]=nums[indx1++];
            }
            else{
                merge[x++]=nums[indx2++];
            }

        }
        while(indx1 <= mid){
            merge[x++]=nums[indx1++];
        }
        while(indx2 <= right){
            merge[x++]=nums[indx2++];
        }
        for(int i=0,j=left;i<merge.length;i++,j++){
            nums[j]=merge[i];
        }
    }

}