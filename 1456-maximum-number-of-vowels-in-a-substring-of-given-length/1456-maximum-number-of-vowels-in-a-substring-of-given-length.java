class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        int maxcount = 0;
        int n = s.length();
        while(r<n){
            if(isVowel(s.charAt(r))){
                count++;
            }
            if(r-l+1==k){
                maxcount = Math.max(maxcount, count);
                if(isVowel(s.charAt(l))){
                    count--;
                }
                l++;
            }
            r++;
        }
        return maxcount;
    }
    public static boolean isVowel(char c){
        if(c=='a'|| c=='e' || c=='i' || c =='o'|| c=='u'){
            return true;
        }
        return false;
    }
}