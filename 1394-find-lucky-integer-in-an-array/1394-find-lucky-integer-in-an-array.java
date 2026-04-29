class Solution {
    public int findLucky(int[] arr) {
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key:arr){
            map.put(key,map.getOrDefault(key,0)+1);

        }
        for(int key:map.keySet()){
            if(map.get(key)==key){
                sum = Math.max(key,sum);
            }
        }
        if(sum!=0)return sum;
        else return -1;
    }
}