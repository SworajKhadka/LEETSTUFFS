class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int i:nums1){
            s1.add(i);
        }
        for(int i:nums2){
            s2.add(i);
        }
        for(int i:s1){
            if(!s2.contains(i)){
                list1.add(i);

            }
        }
        for(int i:s2){
            if(!s1.contains(i)){
                list2.add(i);

            }
        }
        ans.add(list1); // Adds list1 at index 0
        ans.add(list2); // Adds list2 at index 1
        return ans;

        
    }
}