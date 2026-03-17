class Solution {
    public List<Integer> intersection(int[][] nums) {
        //freq approach turned out to be outdated as it can contian valeus beyonf 100
        //we are using set techniques here
        HashSet<Integer> s1 = new HashSet<>();
        for(int i:nums[0]){
            s1.add(i);
        }
        for(int i=1;i<nums.length;i++){
            //create a temporary set so that we can add common values there
            HashSet<Integer> temp = new HashSet<>();
            for(int j:nums[i]){
                temp.add(j);
            }
            s1.retainAll(temp);
        }
        List<Integer> ans = new ArrayList<>(s1);
        Collections.sort(ans);
        return ans;
    }
}