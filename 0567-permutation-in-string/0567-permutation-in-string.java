class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // a very classic problem for fixed window + freq counting
        int n = s1.length();
        int m = s2.length();
        if(n>m)return false;
        int [] s1freq = new int[26];
        int [] window = new int[26];
        for(int i=0;i<s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }
        //check for the condition
        if(Arrays.equals(s1freq,window))return true;
        for(int i=n;i<m;i++){
            //include the new string
            window[s2.charAt(i)-'a']++;
            //exclude the old string
            window[s2.charAt(i-n)-'a']--;
            if(Arrays.equals(s1freq,window))return true;
        }
        return false;
    }
}