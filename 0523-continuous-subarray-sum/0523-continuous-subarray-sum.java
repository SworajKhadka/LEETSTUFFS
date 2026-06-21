class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefixsum= 0;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int target = prefixsum % k;
            if(map.containsKey(target)){
                if(i-map.get(target)>=2)return true;
            }
            else{
                map.put(target,i);
            }
        }   
        return false;   
    }
}