class Solution {
    public int binaryGap(int n) {
        String ans = Integer.toBinaryString(n);
        int l = ans.length();
        char [] ch = ans.toCharArray();
        int lastone = -1;
        int largest = 0;
        for(int i=0;i<l;i++){
            if(ch[i]=='1'){
                if(lastone!=-1){
                    int dist = i-lastone;
                    largest = Math.max(largest,dist);
                }
                lastone = i;
            }
        }
        return largest;
        
    }
}