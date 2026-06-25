class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //write the answer that runs in o(n) TC
        //we gotta use binary search then
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            if(!set.contains(n)){
                set.add(n);
            }
            else{
                ans.add(n);
            }

        }
        return ans;
    }
}