class Solution {
    public int countKeyChanges(String s) {
        HashSet<Character> set = new HashSet<>();
        String str = s.toLowerCase();
        char [] ch = str.toCharArray();
        int n = ch.length;
        int count = 0;
        //we can use nested loops 
        for(int i= 0;i<n-1;i++){
            if(ch[i]!=ch[i+1]){
                count++;
            }
        }
        return count;
    }

}