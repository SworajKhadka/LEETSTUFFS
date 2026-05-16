class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        int n = word.length();
        int a = word.indexOf(ch);
        for(int i=a;i>=0;i--){
            ans.append(word.charAt(i));
        }
        for(int i=a+1;i<n;i++){
            ans.append(word.charAt(i));
        }
        String res = new String(ans);
        return res;
    }
}