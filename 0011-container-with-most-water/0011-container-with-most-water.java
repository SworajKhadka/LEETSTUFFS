class Solution {
    public int maxArea(int[] height) {
        //assigning 2 pointers here
        int maxarea=0;
        int currarea=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            currarea=(right-left)*Math.min(height[left],height[right]);
            maxarea = Math.max(maxarea,currarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }


        }
        return maxarea;
        
    }
}