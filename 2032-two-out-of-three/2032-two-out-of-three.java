class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> ans = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }

        for(int i:nums2){
            if(set1.contains(i)){
                ans.add(i);
            }


        }
        for(int j:nums3){
            if(set1.contains(j)||set2.contains(j)){
                ans.add(j);
            }

        }
        ArrayList<Integer> list = new ArrayList<>(ans);

        return list;
    }
}