class Solution {
    public char findTheDifference(String s, String t) {
        int val1=0;
        int val2=0;

        for(int i=0;i<s.length();i++){
            char A = s.charAt(i);
            val1 = val1+ (int) A;
        }


        for(int j=0;j<t.length();j++){
            char B = t.charAt(j);
            val2 = val2+ (int) B;
        }

        int diff = val2-val1;
        char character = (char) diff;
        return character;

        
    }
}