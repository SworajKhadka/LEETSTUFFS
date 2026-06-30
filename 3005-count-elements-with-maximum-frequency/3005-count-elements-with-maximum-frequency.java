class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int p:map.keySet()){
            max = Math.max(max,map.get(p));
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=max){
                max = entry.getValue();
                sum+=max;
            }
        }
        return sum;
        
    }
}