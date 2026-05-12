class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        // alternate characters
        while(i < word1.length() && j < word2.length()){
            
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));

            i++;
            j++;
        }

        // remaining chars of word1
        while(i < word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }

        // remaining chars of word2
        while(j < word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}