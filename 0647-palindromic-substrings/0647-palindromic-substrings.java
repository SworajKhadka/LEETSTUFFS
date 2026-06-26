class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        //char [] words = s.toCharArray();
        int count =0;
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                boolean ans = check(s,i,j);
                if(ans==true){
                    count++;
                }
            }
        }
        
        return count;
    }
    private boolean check(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}