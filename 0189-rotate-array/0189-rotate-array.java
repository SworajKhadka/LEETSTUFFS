class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        //lets use 2 pointers to reverse the array
        for(int left=0,right = n-1;left<right;left++,right--){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
        }
        //lets rotate it, i.e create a partion and then reverse;
        int l=0;
        int r = k-1;
        while(l<r){
            int temp = nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        int front = k;
        int rear = n-1;
        while(front<rear){
            int temp = nums[front];
            nums[front]=nums[rear];
            nums[rear]=temp;
            front++;
            rear--;
        }
        for(int i=0;i<n;i++){
            System.out.print(nums[i]);
        }

        
    }
}