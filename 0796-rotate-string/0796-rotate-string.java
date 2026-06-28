class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        int n = s.length();
        //lets do the left rotation on s
        char [] ch = s.toCharArray();
        //iterations can be anywhere between 1 rotations to many
        //loop it for 4 times else return false;
        int check = 0;
        while(check<n){
            char saved = ch[0];
            for(int i =0;i<n-1;i++){
                ch[i] = ch[i+1];
            }
            ch[n-1] = saved;
            String ans = new String(ch);
            if(ans.equals(goal))return true;
            check++;
        }
        return false;
    }
}