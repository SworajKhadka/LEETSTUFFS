class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int keys:arr){
            map.put(keys,map.getOrDefault(keys,0)+1);
        }
        for(int i:map.values()){
            count++;
            set.add(i);
        }
        return (count ==set.size());
    }
}