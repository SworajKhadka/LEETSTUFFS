class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        //DUMBASS this is a not a problem of sliding window
        //just we have to keep the position of 1st occ of a string and use last one
        int ans =-1; //if none found, return this
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }
            else{
                ans = Math.max(ans,i-map.get(ch)-1);
            }

        }
        
        return ans;
        
    }
}