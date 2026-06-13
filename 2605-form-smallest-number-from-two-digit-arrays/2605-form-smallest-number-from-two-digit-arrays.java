class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        HashSet<Integer>set1 = new HashSet<>();
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        int p1 = Integer.MAX_VALUE;
        int p2 = Integer.MAX_VALUE;
        int n = nums2.length;
        for(int i:nums1){
            set1.add(i);
            if(small1>i)small1=i;
        }
        for(int j:nums2){
            if(small2>j)small2 =j;
            if(set1.contains(j)){
                smallest = Math.min(smallest,j);
            }

        }
        if(small1<small2){
            p1 = small1*10+small2;
        }
        else if(small2<small1){
            p2 = small2*10+small1;
        }
        if(smallest<p1 && smallest<p2)return smallest;
        else if(p1<p2)return p1;
        else return p2;
    }
}