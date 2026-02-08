class Solution {
    public List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int k=j+1;
                int l=n-1;
                long val = (long)target-nums[i]-nums[j];
                while(k<l){
                    if(nums[k]+nums[l]==val){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    k++;
                    l--;
                    }
                    else if (nums[k]+nums[l]<val){
                    k++;
                    }
                    else l--;

                }

            }


            
        }
        result.addAll(set);
        return result;
    }
}