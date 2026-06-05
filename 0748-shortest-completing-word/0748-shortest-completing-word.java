class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        //count the freq of letters in licensePLate
        //match if the freq>= in the words array
        //lastly, return the min length || the one appearing at first
        HashMap<Character,Integer> map = new HashMap<>();
        String ans = null;
        licensePlate = licensePlate.toLowerCase();
        for(char i:licensePlate.toCharArray()){
            if(Character.isLetter(i)){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        for(String s:words){
            HashMap<Character,Integer> map2 = new HashMap<>();
            for(char c:s.toCharArray()){
                map2.put(c,map2.getOrDefault(c,0)+1);

            }
            //check if the word contains all required letters with enough frequency 
            boolean isValid = true;
            for(char x : map.keySet()){
                //lets check if they satisfy this or not 
                int required = map.get(x);
                int current = map2.getOrDefault(x,0);
                if(current<required){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                if(ans==null|| ans.length()>s.length()){
                    ans = s;
                }
                
            }
        }
            
        
        

        return ans;

    }
}