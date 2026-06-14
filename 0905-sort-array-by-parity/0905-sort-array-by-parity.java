class Solution {
    public int[] sortArrayByParity(int[] nums) {
     int n = nums.length;
     //using 2 pointer approach to solve this problem
     int front = 0;
     int rear = n-1;
     while(front<rear){
        if(nums[front]%2==1 && nums[rear]%2==0){
            int temp = nums[front];
            nums[front] = nums[rear];
            nums[rear]= temp;
            front++;
            rear--;
        }
        else if(nums[front]%2==1 && nums[rear]%2==1){
            rear--;
        }
        else if(nums[front]%2==0 && nums[rear]%2==0){
            front++;
        }
        else{
            front++;
            rear--;
        }
     }
     return nums;
    }
}