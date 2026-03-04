class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        Set <String> results = new HashSet<>();
        for(String word:words){
            StringBuilder sb = new StringBuilder();
            for(char ch:word.toCharArray()){
                sb.append(morse[ch-'a']);
            }
            results.add(sb.toString());

        }
        return results.size();
    }
}