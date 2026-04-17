class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n= nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int mindist = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            //lets define them what mirror actually is
            int a =nums[i];
            int mirror = 0;
            while(a>0){
                int rem = a%10;
                mirror = mirror*10+rem;
                a= a/10;
            }
            if(map.containsKey(nums[i])){
                int prevDist = map.get(nums[i]);
                mindist = Math.min(mindist,i-prevDist);
            }
            map.put(mirror,i);

        }
        return mindist==Integer.MAX_VALUE ? -1:mindist;
    }
}