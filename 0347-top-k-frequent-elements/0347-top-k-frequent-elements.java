class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        int [] ans = new int[k];
        for(int key:nums){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        //I have to sort the values of freq in desc order now 
        List<Map.Entry<Integer,Integer>> list =
        new ArrayList<>(map.entrySet());

        list.sort((a,b) ->
        Integer.compare(b.getValue(), a.getValue()));

        for(int i=0;i<k;i++){
            ans[i] = list.get(i).getKey();
        }
        return ans;
        
    }
}