class Solution {
    public int sumOfUnique(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int sum = 0;
        
        // Sum only unique elements
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                sum += key;
            }
        }
        
        return sum;
    }
}