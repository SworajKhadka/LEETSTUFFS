class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int n = s1.length();
        char [] ch = s1.toCharArray();
        //check if the first letter is matching. 
        for(int i=0;i<n;i++){
            int a =i;
            if(ch[i]==s2.charAt(i)){
                a++;
                int j = a+2;
            }
            else{
                int j=a+2;
                if(j<n){
                char temp  = ch[i];
                ch[i]= ch[j];
                ch[j] = temp;
            }

            }

        }
        String s3 = new String(ch);
        return s3.equals(s2);
    }
}