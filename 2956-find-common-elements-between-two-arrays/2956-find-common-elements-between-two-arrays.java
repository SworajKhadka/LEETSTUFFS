class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        //this is more like checking members in the list
        int count1=0;
        int count2=0;
        Set<Integer> arr1 = new HashSet<>();
        Set<Integer> arr2 = new HashSet<>();
        for(int num:nums1){
            arr1.add(num);
        }
        for(int num:nums2){
            arr2.add(num);
        }
        for(int num:nums1){
            if(arr2.contains(num)){
                count1++;
            }
        }
        for(int num:nums2){
            if(arr1.contains(num)){
                count2++;
            }
        }
        return new int[]{count1,count2};

    }
}