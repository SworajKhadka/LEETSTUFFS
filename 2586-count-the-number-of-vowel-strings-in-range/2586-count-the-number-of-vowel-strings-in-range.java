class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left;i<=right;i++){
            if(isvowel(words[i]))count++;
        }
        return count;       
    }
    public boolean isvowel(String w){
        int n = w.length()-1;
        if((w.charAt(0)=='a' || w.charAt(0) =='e' || w.charAt(0) =='i' || w.charAt(0) =='o' || w.charAt(0) == 'u') && (w.charAt(n)=='a' || w.charAt(n) =='e' || w.charAt(n) =='i' || w.charAt(n) =='o' || w.charAt(n) == 'u')){
            return true;
        }
        return false;
    }
}