class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //this is a binary search problem
        int left = 1;
        int right = 0;
        for(int pile:piles){
            right = Math.max(pile,right);
        }
        int ans = right;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(Caneat(piles,h,mid)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
            
        }
        return ans;
        
    }
    public boolean Caneat(int [] piles, int h, int k){
        long hours = 0;
        for(int i:piles){
            hours+=(i+k-1)/k;
        }
        return hours<=h;
    }

}