class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int key:nums){
            map.put(key,map.getOrDefault(key,0)+1);

        }
        int maxfreq = 0;
        for(int freq:map.values()){
            if(maxfreq<freq){
                maxfreq = freq;
            }
        }
        //count the number of elements with that freq
        int total = 0;
        for(int freq:map.values()){
            if(freq==maxfreq){
                total+=freq;
            }
        }
        return total;
    }
}