class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        //window banam of fixed sized i.e p's length, and then check acoording to freq array
        int m = s.length();
        int n= p.length();
        if (n > m) return ans;
        int [] freq = new int[26];
        int [] check = new int[26];
        for(int i=0;i<n;i++){
            freq[p.charAt(i)-'a']++;
            check[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,check))ans.add(0);
        for(int i=n;i<m;i++){
            //adding the new element in the window
            check[s.charAt(i)-'a']++;
            //removing the prev old one first
            check[s.charAt(i-n)-'a']--;
            if(Arrays.equals(freq,check))ans.add(i-n+1);
        }
        return ans;
    }
}