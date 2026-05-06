class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= fruits.length;
        int ans = 0;
        int left = 0;
        for(int right =0;right<n;right++){
            //mapping fruits with their frequency 
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            //while constraint is violated for condition
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                //completely remove if the num's freq is 0
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}