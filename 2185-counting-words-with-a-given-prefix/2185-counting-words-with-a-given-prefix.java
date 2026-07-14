class Solution {
    public int prefixCount(String[] words, String pref) {
        int l = pref.length();
        int n = words.length;
        int ans = 0;
        for(String s: words){
            int count = 0;
            for(int i =0 ; i< l ;i++){
                if(s.length()<l)break;
                if(s.charAt(i)!=pref.charAt(i)){
                    break;
                }
                else{
                    count++;
                }
            }
            if(count==l)ans++;
        }
        return ans;
    }
}