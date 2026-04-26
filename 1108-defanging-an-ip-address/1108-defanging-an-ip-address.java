class Solution {
    public String defangIPaddr(String address) {
     StringBuilder sb = new StringBuilder();
     for(char ch:address.toCharArray()){
        if(ch == '.'){
            sb.append("[.]");
        }
        else{
            sb.append(ch);
        }
     }   
    
    String ans = sb.toString();
    return ans;
    }
}