class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String s:patterns){
            //as learnt it, they say to use the built in function for the substring 
            if(word.contains(s)){
                count++;
            }
        }
        return count;

        
    }
}