class Solution {
    public boolean judgeCircle(String moves) {
        int [] freq = new int[26];
        String ans = moves.toLowerCase();
        for(int i =0;i<moves.length();i++){
            freq[ans.charAt(i)-'a']++;
        }
        if(freq[11]==freq[17]&&freq[20]==freq[3])return true;
        else return false;


        
    }
}