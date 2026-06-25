class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            int want = target-numbers[i];
            if(map.containsKey(want)){
                return new int[]{map.get(want)+1,i+1};
            }
            map.put(numbers[i],i);

        }
        return new int[]{};
    }
}