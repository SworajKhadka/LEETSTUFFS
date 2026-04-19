class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;
        int dis = 0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]<=nums2[right]){
                int dist = right-left;
                dis = Math.max(dis,dist);
                right++;
            }
            else{
                left++;
            }
            if(left>right)right = left;


        }
        return dis;
    }
}